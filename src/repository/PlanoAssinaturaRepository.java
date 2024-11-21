package repository;

import java.util.HashMap;
import java.util.Map;

import model.Aluno;
import model.PlanoAssinatura;

public class PlanoAssinaturaRepository {
    
    private static PlanoAssinaturaRepository instancia;

    private Map<Integer, PlanoAssinatura> planos = new HashMap<>();
    private Integer planoId = 0;

    private PlanoAssinaturaRepository(){

    }

    public static PlanoAssinaturaRepository getInstancia(){
        
        if (instancia == null){
            instancia = new PlanoAssinaturaRepository();
        }
        
        return instancia;
    }

    public PlanoAssinatura salvar(PlanoAssinatura novoPlano){

        this.planoId++;
        novoPlano.setId(this.planoId);
        planos.put(novoPlano.getId(), novoPlano);
        return novoPlano;

    }

    public PlanoAssinatura buscaPlanoAssinaturaPorId(Integer id){
        return planos.get(id);
    }
}

