package service;

import java.time.LocalDate;
import java.util.List;

import controller.AlunoController;
import payment.OpcaoFaturamento;
import repository.OpcaoFaturamentoRepository;

public class OpcaoFaturamentoService {

    private static OpcaoFaturamentoService instancia;

    private OpcaoFaturamentoService() {
    }

    public static OpcaoFaturamentoService getInstancia() {
        if (instancia == null) {
            instancia = new OpcaoFaturamentoService();
        }
        return instancia;
    }

    // Método para cadastrar uma nova opção de faturamento
    public OpcaoFaturamento cadastrarOpcaoFaturamento(int diaVencimento, Integer alunoId) {

        OpcaoFaturamento novaOpcao = new OpcaoFaturamento(diaVencimento);
        novaOpcao.setDataFechamento(diaVencimento - 10);

        OpcaoFaturamentoRepository.getInstancia().salvar(novaOpcao);

        AlunoController.getInstancia().buscarPorId(alunoId).setOpcaoFaturamentoId(novaOpcao.getId());

        return novaOpcao;

    }

    public OpcaoFaturamento BuscarFaturamentoPorAlunoId(Integer alunoId){
       Integer opcaoDoAlunoId  = AlunoController.getInstancia().buscarPorId(alunoId).getOpcaoFaturamentoId();
       return OpcaoFaturamentoRepository.getInstancia().buscarPorId(opcaoDoAlunoId);
    }

    // Buscar todas as opções de faturamento
    public List<OpcaoFaturamento> buscarTodasOpcoesFaturamento() {
        return OpcaoFaturamentoRepository.getInstancia().buscarTodasOpcoes();
    }

    // Deletar uma opção de faturamento pelo ID
    public boolean deletarOpcaoFaturamento(Integer id) {
        if (OpcaoFaturamentoRepository.getInstancia().existe(id)) {
            OpcaoFaturamentoRepository.getInstancia().deletar(id);
            return true;
        }
        return false;
    }

    // Editar uma opção de faturamento existente
    public boolean editarOpcaoFaturamento(OpcaoFaturamento opcaoAtualizada) {
        if (OpcaoFaturamentoRepository.getInstancia().existe(opcaoAtualizada.getId())) {
            OpcaoFaturamentoRepository.getInstancia().editar(opcaoAtualizada);
            return true;
        }
        return false;
    }

    // Buscar uma opção de faturamento por ID
    public OpcaoFaturamento buscarPorId(Integer id) {
        return OpcaoFaturamentoRepository.getInstancia().buscarPorId(id);
    }


}
