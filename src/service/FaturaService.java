package service;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;
import java.util.List;

import controller.AlunoController;
import controller.ContratoController;
import model.Aluno;
import model.Fatura;
import model.PlanoAssinatura;
import payment.FaturaStatus;
import repository.FaturaRepository;

public class FaturaService {

    private static FaturaService instancia;

    private FaturaService() {
    }

    public static FaturaService getInstancia() {
        if (instancia == null) {
            instancia = new FaturaService();
        }
        return instancia;
    }

    public Fatura salvarFatura(Integer alunoId, double valorTotal, LocalDate dataDeFechamento, LocalDate dataDeVencimento) {
        Fatura novaFatura = new Fatura(valorTotal, dataDeFechamento, dataDeVencimento, FaturaStatus.EM_ABERTO);

        novaFatura.setAlunoId(alunoId);
        
        if (FaturaRepository.getInstancia().salvar(novaFatura) != null) {
            return novaFatura;
        }
        return null;
    }

    public Fatura gerarFatura(Integer alunoId){
        Aluno alunoVinculado = AlunoController.getInstancia().buscarPorId(alunoId);
        if (alunoVinculado!= null){

            PlanoAssinatura plano = ContratoController.getInstancia().buscarPorId(alunoVinculado.getContratoAtualId()).getPlanoAssinatura();

            Double valorTotal = plano.getValor();

            int diaFechamento = OpcaoFaturamentoService.getInstancia().buscarPorId(alunoVinculado.getOpcaoFaturamentoId()).getDiaFechamento();
            int diaVencimento = OpcaoFaturamentoService.getInstancia().buscarPorId(alunoVinculado.getOpcaoFaturamentoId()).getDiaVencimento();

            LocalDate dataFechamento = validarDataVencimento(diaFechamento);
            LocalDate dataVencimento = validarDataVencimento(diaVencimento);

            return FaturaService.getInstancia().salvarFatura(alunoId, valorTotal, dataFechamento, dataVencimento);

        }
        return null;
    }

    private LocalDate dataComDiaEscolhido(int dia){

        LocalDate dataAtual = LocalDate.now();
        dataAtual.withDayOfMonth(dia);

        return dataAtual;
    }

    private LocalDate validarDataVencimento(int diaEscolhido){
        LocalDate dataEscolhida = this.dataComDiaEscolhido(diaEscolhido);


        if (dataEscolhida.isBefore(LocalDate.now())){
            throw new IllegalArgumentException ( 
                "A data de Vencimento não pode ser anterior a data de hoje."
             );
        }

        return this.dataComDiaEscolhido(diaEscolhido);
    }

    public List<Fatura> buscarTodasFaturas() {
        if (!FaturaRepository.getInstancia().getFaturas().isEmpty()) {
            return FaturaRepository.getInstancia().buscarTodasFaturas();
        }
        return null;
    }

    public Fatura deletarFatura(Integer id) {
        if (FaturaRepository.getInstancia().existe(id)) {
            return FaturaRepository.getInstancia().deletar(id);
        }
        return null;
    }
}
