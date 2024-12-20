package controller;

import java.util.List;

import model.Usuario;
import service.UsuarioService;


public class UsuarioController {
    
    private static UsuarioController instancia;

    private UsuarioController() {

    }

    public static UsuarioController getInstancia(){
        if (instancia == null){
            instancia = new UsuarioController();
        }
        return instancia;
    }

    public Usuario cadastrar(String email, String senha) {

        return UsuarioService.getInstancia().cadastrarUsuario(email, senha);
    }

    public boolean existe(String email){
        
        return UsuarioService.getInstancia().existe(email);
    }

    public Usuario buscarPorEmail(String email){
        
        return UsuarioService.getInstancia().buscarPorEmail(email);
    }

    public Usuario buscarPorId(Integer id){

        return UsuarioService.getInstancia().buscarPorId(id);
    }

    public void PessoaUsuarioLink(Integer usuario, Integer pessoa){
        UsuarioService.getInstancia().PessoaUsuarioLink(usuario, pessoa);
    }

    public List<Usuario> buscarTodos() {
        
        return UsuarioService.getInstancia().buscarTodosUsuarios();
    }





}
