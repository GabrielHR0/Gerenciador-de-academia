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

        Usuario novoUsuario = new Usuario(email, senha);
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

    public List<Usuario> buscarTodosUsuarios(){
        if (!this.UsuarioRepository.getInstancia().getUsuarios().isEmpty()){
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
