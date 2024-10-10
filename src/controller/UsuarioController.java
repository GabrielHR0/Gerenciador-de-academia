package controller;

import java.util.List;

import model.Usuario;
import service.UsuarioService;


public class UsuarioController {
    
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario cadastrar(String email, String senha) {

        return usuarioService.cadastrarUsuario(email, senha);

    }

    public List<Usuario> buscarTodos() {
        
        return usuarioService.buscarTodosUsuarios();
        
    }





}
