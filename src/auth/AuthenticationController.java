package auth;

import java.time.LocalDate;

import model.Usuario;

public class AuthenticationController {
    
    private static AuthenticationController instancia;

    private AuthenticationController(){

    }

    public static AuthenticationController getInstancia(){

        if(instancia==null){
            instancia = new AuthenticationController( );
        }
        return instancia;
    }

    public Usuario cadastrar(String email, String senha){

        try{
            return AuthenticationService.getInstancia().cadastrar(email, senha);
        } 
        catch(IllegalArgumentException e){
            throw e;
        }
    }

    public void login(String email, String senha){

        try {
            Usuario usuariologado = AuthenticationService.getInstancia().login(email, senha);
            GerenciarSessao.getInstancia().iniciarSessao(usuariologado.getId());

        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void logout(){

        GerenciarSessao.getInstancia().encerrarSessao();
    }

}
