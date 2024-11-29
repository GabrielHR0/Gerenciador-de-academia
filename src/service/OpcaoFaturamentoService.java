package service;

import java.util.List;

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
    public OpcaoFaturamento cadastrarOpcaoFaturamento(String descricao, Double valor) {
        OpcaoFaturamento novaOpcao = new OpcaoFaturamento(descricao, valor);
        return OpcaoFaturamentoRepository.getInstancia().salvar(novaOpcao);
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
    public OpcaoFaturamento buscarOpcaoPorId(Integer id) {
        return OpcaoFaturamentoRepository.getInstancia().buscarPorId(id);
    }
}
