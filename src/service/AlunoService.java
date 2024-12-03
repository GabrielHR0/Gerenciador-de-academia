package service;

import java.util.List;

import model.Aluno;
import model.Usuario;
import repository.AlunoRepository;

public class AlunoService {
    
    private static AlunoService instancia;

    private AlunoService(){

    }

    public static AlunoService getInstancia(){

        if (instancia == null){
            instancia = new AlunoService();
        }

        return instancia;
    }

    public Aluno cadastrarPessoa(String nome, String cpf, String telefone, String email){ 

        Aluno novoAluno = new Aluno(nome, cpf, telefone, email);
        if (AlunoRepository.getInstancia().salvar(novoAluno) != null){
            return novoAluno;
        }
        return null;

    }

    public Aluno buscarPorId(Integer id){

        return AlunoRepository.getInstancia().buscarAlunoPorId(id);

    }


    public List<Aluno> buscarTodosAlunos(){
        if (!AlunoRepository.getInstancia().getAlunos().isEmpty()){
            return AlunoRepository.getInstancia().buscarTodosAlunos();
        }

        return null;
    }

    public Aluno deletarUsuario(Integer id){

        if (AlunoRepository.getInstancia().existe(id)) {
            return AlunoRepository.getInstancia().deletar(id);
        }

        return null;
    }

}
