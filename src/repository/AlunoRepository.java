package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;
import model.Usuario;

public class AlunoRepository {

    private Map<Integer, Aluno> alunos = new HashMap<>();
    private Integer alunoId = 1;

    public AlunoRepository(){

    }

    public Aluno salvar(Aluno novoAluno){

        novoAluno.setId(this.alunoId++);
        alunos.put(alunoId, novoAluno);

        return novoAluno;
    }

     public Aluno deletar(Integer id){

        return alunos.remove(id);
            
    }

    public void editar(Integer id){
            
        // Implementar a lógica para editar uma pessoa
            
    }

    public Aluno buscarUsuarioPorId(Integer id) {
            
        return alunos.get(id);

    }

    public Boolean existe(Integer id){
        return alunos.get(id) != null;
    }

    public List<Aluno> buscarTodosAlunos() {

        return new ArrayList<>(alunos.values());

    }

    public Map<Integer, Aluno> getAlunos() {
        return alunos;
    }
}
