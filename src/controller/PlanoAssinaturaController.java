package controller;

import model.PlanoAssinatura;
import repository.PlanoAssinaturaRepository;
import service.PlanoAssinaturaService;

public class PlanoAssinaturaController {
    
    private static PlanoAssinaturaController instancia;

    private PlanoAssinaturaController() {
        
    }

    public static PlanoAssinaturaController getInstancia() {
        if (instancia == null) {
            instancia = new PlanoAssinaturaController();
        }
        return instancia;
    
    }

    public PlanoAssinatura cadastrarPlanoAssinatura(Integer contratoId, PlanoAssinatura planoAssinado) {

        return PlanoAssinaturaService.getInstancia().AssinarPlano(contratoId, planoAssinado);

    }

    public PlanoAssinatura cadastrarPlanoAssinatura(Integer duracaoNeses, String nome, Integer TabelaPrecoMensalId){

        return PlanoAssinaturaService.getInstancia().criarPlano(duracaoNeses, nome, TabelaPrecoMensalId);

    }

}
