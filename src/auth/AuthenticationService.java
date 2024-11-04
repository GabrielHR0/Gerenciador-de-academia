package auth;

import controller.UsuarioController;
import model.Usuario;

public class AuthenticationService {
    
    private static AuthenticationService instancia;
    private final UsuarioController usuarioController;

    private AuthenticationService() {
        this.usuarioController = UsuarioController.getInstancia();
    }

    public static AuthenticationService getInstancia() {
        if (instancia == null){
            instancia = new AuthenticationService();
        }

        return instancia;
    }

    public Usuario cadastrar(String email, String senha){
        
        if (usuarioController.existe(email)){
            throw new IllegalArgumentException("Email já cadastrado.");
        }
        return usuarioController.cadastrar(email, senha);

    }

    public Usuario login(String email, String senha){

        Usuario usuarioEncontrado = usuarioController.buscarPorEmail(email);

        if (usuarioEncontrado == null) {
            throw new IllegalArgumentException("Usuário não existe.");
        }
        
        if (!usuarioEncontrado.getSenha().equals(senha)) {
            throw new IllegalArgumentException("Email ou senha inválidos.");
        }
        
        return usuarioEncontrado;
    }

}
