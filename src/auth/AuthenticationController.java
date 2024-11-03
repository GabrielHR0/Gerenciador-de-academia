package auth;

import java.time.LocalDate;

import model.Usuario;

public class AuthenticationController {
    
    private static AuthenticationController instancia;
    private final AuthenticationService authenticationService;
    private GerenciarSessao sessao;

    private AuthenticationController(AuthenticationService authenticationService, GerenciarSessao sessao){
        this.authenticationService = authenticationService;
        this.sessao = sessao;
    }

    public static AuthenticationController getInstancia(){

        if(instancia==null){
            instancia = new AuthenticationController(AuthenticationService.getInstancia(), GerenciarSessao.getInstancia());
        }
        return instancia;
    }

    public Usuario cadastrar(String email, String senha){

        try{
            return authenticationService.cadastrar(email, senha);
        } 
        catch(IllegalArgumentException e){
            throw e;
        }
    }

    public void login(String email, String senha){

        try {
            Usuario usuariologado = authenticationService.login(email, senha);
            sessao.iniciarSessao(usuariologado.getId());

        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void logout(){

        sessao.encerrarSessao();
    }

}
