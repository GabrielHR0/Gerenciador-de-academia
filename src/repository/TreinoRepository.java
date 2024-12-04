package repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Exercicio;
import model.Instrutor;
import model.Treino;

public class TreinoRepository {
    
    private static TreinoRepository instancia; // Singleton

    private HashMap<Integer, Treino> treinos = new HashMap<>();
    private Integer id = 1;

    public static TreinoRepository getInstancia(){
        if(instancia == null){
            instancia = new TreinoRepository();
        }
        return instancia;
    }

    public Treino salvar(Treino novoTreino){
        novoTreino.setId(this.id++);
        treinos.put(novoTreino.getId(), novoTreino);
        return novoTreino;
    }

    public Treino remover(Integer id){

        return treinos.remove(id);
    }

    public Treino editar(Integer id, String nome, String descricao, List<Exercicio> exercicios, Instrutor instrutor, Date dia){
        if(existe(id)){
            Treino treinoEditado = treinos.get(id);
            treinoEditado.setNome(nome);
            treinoEditado.setDescricao(descricao);
            treinoEditado.setExercicios(exercicios);
            treinoEditado.setInstrutor(instrutor);
            treinoEditado.setDia(dia);
            return treinoEditado;
        }
        return null;
    }

    public Treino buscarPorId(Integer id){

        return treinos.get(id);
    }

    public Boolean existe(Integer id){

        return treinos.get(id) != null;
    }

    public List<Treino> buscarTodosTreinos(){
        
        return new ArrayList<>(treinos.values());
    }

    public Map<Integer, Treino> getTreino(){
        
        return treinos;
    }
}
