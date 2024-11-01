package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Exercicio;
import model.Usuario;

public class ExercicioRepository {
    
    private static ExercicioRepository instancia; //Singleton

    private HashMap<Integer, Exercicio> exercicios = new HashMap<>();
    private Integer id = 1;

    public static ExercicioRepository getInstancia() {
        if(instancia == null){
            instancia = new ExercicioRepository();
        }
        return instancia;
    }

    public Exercicio salvar(Exercicio novoExercicio){
        novoExercicio.setId(this.id++);
        exercicios.put(novoExercicio.getId(), novoExercicio);
        return novoExercicio;
    }

    public Exercicio deletar(Integer id){

        return exercicios.remove(id);
    }

    public Exercicio editar(Integer id, int repeticoes, int series){
        if(existe(id)){
            Exercicio exercicioEditado = exercicios.get(id);
            exercicioEditado.setRepeticoes(repeticoes);
            exercicioEditado.setSeries(series);
            return exercicioEditado;
        }
        return null;
    }

    public Exercicio buscarExercicioporId(Integer id){
        
        return exercicios.get(id);
    }

    public Boolean existe(Integer id){
        
        return exercicios.get(id) != null;
    } 

    public List<Exercicio> buscarTodosExercicios(){

        return new ArrayList<>(exercicios.values());
    }

    public Map<Integer, Exercicio> getExercicio() {
        return exercicios;
    }
}
