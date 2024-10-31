package service;

import java.util.List;

import model.Exercicio;
import model.TipoExercicio;
import repository.ExercicioRepository;
import repository.UsuarioRepository;

public class ExercicioService {

    private final ExercicioRepository exercicioRepository;

    private static ExercicioService instancia;

    private ExercicioService(ExercicioRepository exercicioRepository){
        this.exercicioRepository = exercicioRepository;
    }

    public Exercicio cadastrarExercicio(TipoExercicio tipoExercicio, int repeticoes, int series){

        Exercicio novoExercicio = new Exercicio(tipoExercicio, repeticoes, series);
        if(exercicioRepository.salvar(novoExercicio) != null){
            return novoExercicio;
        }
        return null;
    }

    public static ExercicioService getInstancia(){
        
        if (instancia == null){
            instancia = new ExercicioService(ExercicioRepository.getInstancia());

        }
        return instancia;

    }

    public List<Exercicio> buscarTodosExercicio(){

        if(!this.exercicioRepository.getExercicio().isEmpty()){
            return exercicioRepository.buscarTodosExercicios();
        }
        return null;
    }

    public Exercicio deletarExercicio(Integer id){
        if(exercicioRepository.existe(id)){
            return exercicioRepository.deletar(id);
        }
        return null;
    }
    
}
