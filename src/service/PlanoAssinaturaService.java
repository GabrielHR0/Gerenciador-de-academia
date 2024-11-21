package service;

import controller.TabelaPrecoController;
import model.PlanoAssinatura;
import repository.PlanoAssinaturaRepository;
import subscription.TabelaPreco;

public class PlanoAssinaturaService {
    
    private static PlanoAssinaturaService instancia;

    private PlanoAssinaturaService() {
    }

    public static PlanoAssinaturaService getInstancia() {
        if (instancia == null) {
            instancia = new PlanoAssinaturaService();
        }
        return instancia;
    }

    public PlanoAssinatura AssinarPlano(Integer ContratoId, PlanoAssinatura planoAssinado){

        ContratoService.getInstancia().buscarPorId(ContratoId).setPlanoAssinatura(planoAssinado);

        return planoAssinado;

    }

    public PlanoAssinatura criarPlano(Integer duracaoMeses, String nome, Integer tabelaPrecoAtualId){

        double precoFinal = calcularPrecoFinal(tabelaPrecoAtualId, duracaoMeses);

        PlanoAssinatura novoPlano = new PlanoAssinatura(nome, precoFinal, duracaoMeses);

        return PlanoAssinaturaRepository.getInstancia().salvar(novoPlano);
        
    }

    public double calcularPrecoFinal(Integer tabelaPrecoId, Integer duracaoMeses){

        TabelaPreco tabelaAtual = TabelaPrecoController.getInstancia().buscarPorId(tabelaPrecoId);

        return tabelaAtual.getValorMensal() * duracaoMeses - (tabelaAtual.getDesconto() * tabelaAtual.getValorMensal() * duracaoMeses);

    }

    public PlanoAssinatura buscarPlanoAssinaturaPorId(Integer id) {
        return PlanoAssinaturaRepository.getInstancia().buscaPlanoAssinaturaPorId(id);
    }
}
