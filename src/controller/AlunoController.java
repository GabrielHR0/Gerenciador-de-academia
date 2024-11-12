package controller;

import java.util.List;
import model.Aluno;
import service.AlunoService;

public class AlunoController {

    private static AlunoController instancia;

    private AlunoController() {
        
    }

    public static AlunoController getInstancia() {
        if (instancia == null) {
            instancia = new AlunoController();
        }
        return instancia;
    }

    public Aluno cadastrarAluno(String nome, String cpf, String telefone, String email) {

        return AlunoService.getInstancia().cadastrarPessoa(nome, cpf, telefone, email);

    }

    public List<Aluno> listarAlunos() {

        return AlunoService.getInstancia().buscarTodosAlunos();

    }

    public Aluno deletarAluno(Integer id) {

        return AlunoService.getInstancia().deletarUsuario(id);

    }
}
