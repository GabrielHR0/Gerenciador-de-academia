package service;

import java.util.Date;
import java.util.List;

import model.Exercicio;
import model.Instrutor;
import model.Treino;
import repository.TreinoRepository;

public class TreinoService {
    
    private final TreinoRepository treinoRepository;

    private static TreinoService instancia;

    private TreinoService(TreinoRepository treinoRepository){
        this.treinoRepository = treinoRepository;
    }

    public static TreinoService getInstancia(){
        if(instancia == null){
            instancia = new TreinoService(TreinoRepository.getInstancia());
        }
        return instancia;
    }

    public Treino cadastrarTreino(String nome, String descricao, List<Exercicio> exercicio, Instrutor instrutor, Date dia){
        
        Treino novoTreino = new Treino(nome, descricao, exercicio, instrutor, dia);
        if(treinoRepository.salvar(novoTreino) != null){
            return novoTreino;
        }
        return null;
    }

    public List<Treino> buscarTodosTreinos(){

        if(!this.treinoRepository.getTreino().isEmpty()){
            return treinoRepository.buscarTodosTreinos();
        }
        return null;
    }

    public Treino deletaTreino(Integer id){
        if(treinoRepository.existe(id)){
            return treinoRepository.remover(id);
        }
        return null;
    }
}
