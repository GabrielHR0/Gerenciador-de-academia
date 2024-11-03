package service;

import java.util.List;

import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioService {
    
    private static UsuarioService instancia;
    private final UsuarioRepository usuarioRepository;

    private UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public static UsuarioService getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioService(UsuarioRepository.getInstancia());
        }
        return instancia;
    }

    public Usuario cadastrarUsuario(String email, String senha) {

        Usuario novoUsuario = new Usuario(email, senha);
        if (usuarioRepository.salvar(novoUsuario) != null) {
            return novoUsuario;
        }

        return null;

    }

    public boolean existe(String email){

        return usuarioRepository.existe(email) != null;
    }

    public Usuario buscarPorEmail(String email){

        return usuarioRepository.existe(email);
    }

    public List<Usuario> buscarTodosUsuarios(){
        if (!this.usuarioRepository.getUsuarios().isEmpty()){
            return usuarioRepository.buscarTodosUsuarios();
        }

        return null;
    }

    public Usuario deletarUsuario(Integer id){

        if (usuarioRepository.existe(id)) {
            return usuarioRepository.deletar(id);
        }

        return null;
    }

}
