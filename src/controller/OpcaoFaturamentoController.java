package controller;

import java.util.List;

import service.OpcaoFaturamentoService;
import payment.OpcaoFaturamento;

public class OpcaoFaturamentoController {

    private static OpcaoFaturamentoController instancia;

    private OpcaoFaturamentoController() {
    }

    public static OpcaoFaturamentoController getInstancia() {
        if (instancia == null) {
            instancia = new OpcaoFaturamentoController();
        }
        return instancia;
    }

    // Cadastrar uma nova opção de faturamento
    public OpcaoFaturamento cadastrarOpcaoFaturamento(int diaVencimento, Integer alunoId) {
        return OpcaoFaturamentoService.getInstancia().cadastrarOpcaoFaturamento(diaVencimento, alunoId);
    }

    // Buscar opção de faturamento por aluno
    public OpcaoFaturamento buscarFaturamentoPorAlunoId(Integer alunoId) {
        return OpcaoFaturamentoService.getInstancia().BuscarFaturamentoPorAlunoId(alunoId);
    }

    // Buscar todas as opções de faturamento
    public List<OpcaoFaturamento> buscarTodasOpcoesFaturamento() {
        return OpcaoFaturamentoService.getInstancia().buscarTodasOpcoesFaturamento();
    }

    // Deletar uma opção de faturamento
    public boolean deletarOpcaoFaturamento(Integer id) {
        return OpcaoFaturamentoService.getInstancia().deletarOpcaoFaturamento(id);
    }

    // Editar uma opção de faturamento
    public boolean editarOpcaoFaturamento(OpcaoFaturamento opcaoAtualizada) {
        return OpcaoFaturamentoService.getInstancia().editarOpcaoFaturamento(opcaoAtualizada);
    }

    // Buscar uma opção de faturamento por ID
    public OpcaoFaturamento buscarPorId(Integer id) {
        return OpcaoFaturamentoService.getInstancia().buscarPorId(id);
    }
}
