package service;

import java.util.Date;
import java.util.List;

import model.Exercicio;
import model.Instrutor;
import model.Treino;
import repository.TreinoRepository;

public class TreinoService {
    

    private static TreinoService instancia;

    private TreinoService(){
       
    }

    public static TreinoService getInstancia(){
        if(instancia == null){
            instancia = new TreinoService();
        }
        return instancia;
    }

    public Treino cadastrarTreino(String nome, String descricao, List<Exercicio> exercicio, Instrutor instrutor, Date dia){
        
        Treino novoTreino = new Treino(nome, descricao, exercicio, instrutor, dia);
        if(TreinoRepository.getInstancia().salvar(novoTreino) != null){
            return novoTreino;
        }
        return null;
    }

    public List<Treino> buscarTodosTreinos(){

        if(!TreinoRepository.getInstancia().getTreino().isEmpty()){
            return TreinoRepository.getInstancia().buscarTodosTreinos();
        }
        return null;
    }

    public Treino buscarPorId(Integer id) {
        if(TreinoRepository.getInstancia().existe(id)){
            return TreinoRepository.getInstancia().buscarPorId(id);
        }
        return null;
    }

    public Treino deletaTreino(Integer id){
        if(TreinoRepository.getInstancia().existe(id)){
            return TreinoRepository.getInstancia().remover(id);
        }
        return null;
    }
}
