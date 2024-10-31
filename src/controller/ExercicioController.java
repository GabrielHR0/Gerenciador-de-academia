package controller;

import java.util.List;

import model.Exercicio;
import model.TipoExercicio;
import service.ExercicioService;
import service.UsuarioService;

public class ExercicioController {
    
    private static ExercicioController instancia;
    private final ExercicioService exercicioService;

    private ExercicioController(ExercicioService exercicioService){
        this.exercicioService = exercicioService;
    }

    public static ExercicioController getInstancia(){
        if (instancia == null){
            instancia = new ExercicioController(ExercicioService.getInstancia());
        }
        return instancia;
    }

    public Exercicio cadastrar(TipoExercicio tipoExercicio, int repeticoes, int serie){
        return exercicioService.cadastrarExercicio(tipoExercicio, repeticoes, serie);
    }

    public List<Exercicio> buscarTodos(){
        return exercicioService.buscarTodosExercicio();
    }
}
