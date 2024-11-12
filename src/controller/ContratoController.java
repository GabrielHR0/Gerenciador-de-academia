package controller;

import model.Aluno;
import model.Contrato;
import model.PlanoAssinatura;
import service.ContratoService;

public class ContratoController {

    // Instância única (Singleton)
    private static ContratoController instancia;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private ContratoController() {}

    // Método para obter a instância única do controller
    public static ContratoController getInstancia() {
        if (instancia == null) {
            instancia = new ContratoController();
        }
        return instancia;
    }

    public Contrato cadastrar() {
        return ContratoService.getInstancia().cadastrarContrato();
    }

    public Contrato contratar(Contrato contrato, Aluno aluno) {
        return ContratoService.getInstancia().definirContratoAtual(contrato, aluno);
    }

    public Contrato definirPlano(Contrato contrato, PlanoAssinatura plano) {
        return ContratoService.getInstancia().definirPlano(contrato, plano);
    }
}
