package service;

import java.util.List;

import model.Usuario;
import repository.UsuarioRepository;

public class UsuarioService {
    
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrarUsuario(String email, String senha) {

        Usuario novoUsuario = new Usuario(email, senha);
        if (usuarioRepository.salvar(novoUsuario) != null) {
            return novoUsuario;
        }

        return null;

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
