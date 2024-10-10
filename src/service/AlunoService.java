package service;

import java.util.List;

import model.Aluno;
import model.Usuario;
import repository.AlunoRepository;

public class AlunoService {
    
    private AlunoRepository alunoRepository;

    public Aluno cadastrarPessoa(String nome, String cpf, String telefone, String email){ 

        Aluno novoAluno = new Aluno(nome, cpf, telefone, email);
        if (alunoRepository.salvar(novoAluno) != null){
            return novoAluno;
        }
        return null;

    }


    public List<Aluno> buscarTodosAlunos(){
        if (!this.alunoRepository.getAlunos().isEmpty()){
            return alunoRepository.buscarTodosAlunos();
        }

        return null;
    }

    public Aluno deletarUsuario(Integer id){

        if (alunoRepository.existe(id)) {
            return alunoRepository.deletar(id);
        }

        return null;
    }

}
