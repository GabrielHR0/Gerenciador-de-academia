package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Fatura;

public class FaturaRepository {

    private static FaturaRepository instancia;

    private Map<Integer, Fatura> faturas = new HashMap<>();
    private Integer faturaId = 0;

    private FaturaRepository() {
    }

    public static FaturaRepository getInstancia() {
        if (instancia == null) {
            instancia = new FaturaRepository();
        }
        return instancia;
    }

    public Fatura salvar(Fatura novaFatura) {
        this.faturaId++;
        novaFatura.setId(this.faturaId);
        faturas.put(novaFatura.getId(), novaFatura);
        return novaFatura;
    }

    public Fatura deletar(Integer id) {
        return faturas.remove(id);
    }

    public void editar(Fatura faturaAtualizada) {
        if (faturas.containsKey(faturaAtualizada.getId())) {
            faturas.put(faturaAtualizada.getId(), faturaAtualizada);
        }
    }

    public Fatura buscarPorId(Integer id) {
        return faturas.get(id);
    }

    public Boolean existe(Integer id) {
        return faturas.containsKey(id);
    }

    public List<Fatura> buscarTodasFaturas() {
        return new ArrayList<>(faturas.values());
    }

    public Map<Integer, Fatura> getFaturas() {
        return faturas;
    }
}
