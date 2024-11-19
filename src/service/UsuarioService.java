package service;

import java.util.List;

import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioService {
    
    private static UsuarioService instancia;

    private UsuarioService() {

    }

    public static UsuarioService getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioService();
        }
        return instancia;
    }

    public Usuario cadastrarUsuario(String email, String senha) {
        // Verifica se o usuário já existe com o mesmo e-mail
        if (UsuarioRepository.getInstancia().existe(email) != null) {
            // Retorna null se já existir um usuário com esse email
            System.out.println("Usuário com o e-mail " + email + " já existe.");
            return null;
        }
        
        // Se o usuário não existe, cria um novo
        Usuario novoUsuario = new Usuario(email, senha);
        
        // Tenta salvar o novo usuário no repositório
        if (UsuarioRepository.getInstancia().salvar(novoUsuario) != null) {
            return novoUsuario;
        }
    
        return null;
    }

    public boolean existe(String email){

        return UsuarioRepository.getInstancia().existe(email) != null;
    }

    public Usuario buscarPorEmail(String email){

        return UsuarioRepository.getInstancia().existe(email);
    }

    public Usuario buscarPorId(Integer id){

        return UsuarioRepository.getInstancia().buscarUsuarioPorId(id);
        
    }

    public List<Usuario> buscarTodosUsuarios(){
        if (!UsuarioRepository.getInstancia().getUsuarios().isEmpty()){
            return UsuarioRepository.getInstancia().buscarTodosUsuarios();
        }

        return null;
    }

    public Usuario deletarUsuario(Integer id){

        if (UsuarioRepository.getInstancia().existe(id)) {
            return UsuarioRepository.getInstancia().deletar(id);
        }

        return null;
    }

}
