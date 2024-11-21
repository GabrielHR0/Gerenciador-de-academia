package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;
import model.Usuario;

public class AlunoRepository {

    private static AlunoRepository instancia;

    private Map<Integer, Aluno> alunos = new HashMap<>();
    private Integer alunoId = 0;

    private AlunoRepository(){

    }

    public static AlunoRepository getInstancia(){
        
        if (instancia == null){
            instancia = new AlunoRepository();
        }
        
        return instancia;
    }

    public Aluno salvar(Aluno novoAluno){

        this.alunoId++;
        novoAluno.setId(this.alunoId);
        alunos.put(novoAluno.getId(), novoAluno);

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
