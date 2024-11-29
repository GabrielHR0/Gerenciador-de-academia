package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import payment.OpcaoFaturamento;

public class OpcaoFaturamentoRepository {

    private static OpcaoFaturamentoRepository instancia;

    private Map<Integer, OpcaoFaturamento> opcoesFaturamento = new HashMap<>();
    private Integer opcaoFaturamentoId = 0;

    private OpcaoFaturamentoRepository() {
    }

    public static OpcaoFaturamentoRepository getInstancia() {
        if (instancia == null) {
            instancia = new OpcaoFaturamentoRepository();
        }
        return instancia;
    }

    public OpcaoFaturamento salvar(OpcaoFaturamento novaOpcao) {
        this.opcaoFaturamentoId++;
        novaOpcao.setId(this.opcaoFaturamentoId);
        opcoesFaturamento.put(novaOpcao.getId(), novaOpcao);
        return novaOpcao;
    }

    public OpcaoFaturamento deletar(Integer id) {
        return opcoesFaturamento.remove(id);
    }

    public void editar(OpcaoFaturamento opcaoAtualizada) {
        if (opcoesFaturamento.containsKey(opcaoAtualizada.getId())) {
            opcoesFaturamento.put(opcaoAtualizada.getId(), opcaoAtualizada);
        }
    }

    public OpcaoFaturamento buscarPorId(Integer id) {
        return opcoesFaturamento.get(id);
    }

    public Boolean existe(Integer id) {
        return opcoesFaturamento.containsKey(id);
    }

    public List<OpcaoFaturamento> buscarTodasOpcoes() {
        return new ArrayList<>(opcoesFaturamento.values());
    }

    public Map<Integer, OpcaoFaturamento> getOpcoesFaturamento() {
        return opcoesFaturamento;
    }
}
