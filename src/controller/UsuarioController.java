package controller;

import java.util.List;

import model.Usuario;
import service.UsuarioService;


public class UsuarioController {
    
    private static UsuarioController instancia;
    private final UsuarioService usuarioService;

    private UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public static UsuarioController getInstancia(){
        if (instancia == null){
            instancia = new UsuarioController(UsuarioService.getInstancia());
        }
        return instancia;
    }

    public Usuario cadastrar(String email, String senha) {

        return usuarioService.cadastrarUsuario(email, senha);
    }

    public boolean existe(String email){
        
        return usuarioService.existe(email);
    }

    public Usuario buscarPorEmail(String email){
        
        return usuarioService.buscarPorEmail(email);
    }

    public List<Usuario> buscarTodos() {
        
        return usuarioService.buscarTodosUsuarios();
    }





}
