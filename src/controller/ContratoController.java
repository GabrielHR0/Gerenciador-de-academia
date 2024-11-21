package controller;

import model.Aluno;
import model.Contrato;
import model.PlanoAssinatura;
import service.ContratoService;

public class ContratoController {

    private static ContratoController instancia;

    private ContratoController() {}

    public static ContratoController getInstancia() {
        if (instancia == null) {
            instancia = new ContratoController();
        }
        return instancia;
    }

    public Contrato cadastrar() {
        return ContratoService.getInstancia().cadastrarContrato();
    }

    public Contrato buscarPorId(Integer id) {
        
        return ContratoService.getInstancia().buscarPorId(id);
        
    }

    public Contrato contratar(Contrato contrato, Aluno aluno) {
        return ContratoService.getInstancia().definirContratoAtual(contrato, aluno);
    }

    public Contrato definirPlano(Contrato contrato, PlanoAssinatura plano) {
        return ContratoService.getInstancia().definirPlano(contrato, plano);
    }
}
