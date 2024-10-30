package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Usuario;

public class UsuarioRepository {


    private static UsuarioRepository instancia;

    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private Integer usuarioId = 1;

    private UsuarioRepository() {
        
    }

    public static UsuarioRepository getInstancia(){
        
        if (instancia == null){
            instancia = new UsuarioRepository();
        }
        return instancia;

    }

    public Usuario salvar(Usuario novoUsuario){

        novoUsuario.setId(this.usuarioId++);
        usuarios.put(this.usuarioId, novoUsuario);
        return novoUsuario;

    }

    public Usuario deletar(Integer id){

        return usuarios.remove(id);
            
    }

    public void editar(Integer id){
            
        // Implementar a lógica para editar um usuário
            
    }

    public Usuario buscarUsuarioPorId(Integer id) {
            
        return usuarios.get(id);

    }

    public Boolean existe(Integer id){
        return usuarios.get(id) != null;
    }

    public List<Usuario> buscarTodosUsuarios() {

        return new ArrayList<>(usuarios.values());

    }

    public Map<Integer, Usuario> getUsuarios() {
        return usuarios;
    }


}
