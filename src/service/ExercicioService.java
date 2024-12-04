package service;

import java.util.List;

import model.Exercicio;
import model.TipoExercicio;
import repository.ExercicioRepository;
import repository.UsuarioRepository;

public class ExercicioService {


    private static ExercicioService instancia;

    private ExercicioService(){

    }

    public Exercicio cadastrarExercicio(TipoExercicio tipoExercicio, int repeticoes, int series){

        Exercicio novoExercicio = new Exercicio(tipoExercicio, repeticoes, series);
        if(ExercicioRepository.getInstancia().salvar(novoExercicio) != null){
            return novoExercicio;
        }
        return null;
    }

    public static ExercicioService getInstancia(){
        
        if (instancia == null){
            instancia = new ExercicioService();

        }
        return instancia;

    }

    public List<Exercicio> buscarTodosExercicio(){

        if(!ExercicioRepository.getInstancia().getExercicio().isEmpty()){
            return ExercicioRepository.getInstancia().buscarTodosExercicios();
        }
        return null;
    }

    public Exercicio buscarPorId(Integer id) {
        if(ExercicioRepository.getInstancia().existe(id)){
            return ExercicioRepository.getInstancia().buscarExercicioporId(id);
        }
        return null;
    }

    public Exercicio deletarExercicio(Integer id){
        if(ExercicioRepository.getInstancia().existe(id)){
            return ExercicioRepository.getInstancia().deletar(id);
        }
        return null;
    }
    
}
