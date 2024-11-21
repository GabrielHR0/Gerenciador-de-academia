package repository;

import java.util.HashMap;
import java.util.Map;

import subscription.TabelaPreco;

public class TabelaPrecoRepository {

    private static TabelaPrecoRepository instancia;

    private Map<Integer, TabelaPreco> precos = new HashMap<>();
    private Integer precoId = 0;

    private TabelaPrecoRepository() {
    
    }

    public static TabelaPrecoRepository getInstancia(){
        if (instancia == null){
            instancia = new TabelaPrecoRepository();
        }
        return instancia;
    }

    public TabelaPreco addTabelaPreco(TabelaPreco novoPreco){
        
        this.precoId++;
        novoPreco.setId(this.precoId);
        precos.put(this.precoId, novoPreco);
        return novoPreco;

    }

    public TabelaPreco buscarTabelaPorId(Integer id){
        return precos.get(id);
    }

}
