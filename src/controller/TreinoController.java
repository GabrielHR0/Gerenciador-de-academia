package controller;

import java.util.Date;
import java.util.List;

import model.Exercicio;
import model.Instrutor;
import model.Treino;
import service.ExercicioService;
import service.TreinoService;

public class TreinoController {
    
    private final TreinoService treinoService;
    private static TreinoController instancia;

    private TreinoController(TreinoService treinoService){
        this.treinoService = treinoService;
    }

    public static TreinoController getInstancia(){
        if(instancia == null){
            instancia = new TreinoController(TreinoService.getInstancia());
        }
        return instancia;
    }

    public Treino cadastrar(String nome, String descricao, List<Exercicio> exercicio, Instrutor instrutor, Date dia){
        return treinoService.cadastrarTreino(nome, descricao, exercicio, instrutor, dia);
    }

    public List<Treino> buscarTodos(){
        return treinoService.buscarTodosTreinos();
    }

    public Treino deletarTreino(Integer id){
        return treinoService.deletaTreino(id);
    }

}
