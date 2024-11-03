package app;

import auth.AuthenticationController;
import auth.GerenciarSessao;
import controller.UsuarioController;
import model.Usuario;

public class Main {
    
    public static void main(String[] args) {
        AuthenticationController auth = AuthenticationController.getInstancia();

        // Cadastro de novos usuários
        Usuario usuario1 = auth.cadastrar("gabriel@gmail.com", "123456");
        Usuario usuario2 = auth.cadastrar("maria@gmail.com", "abcdef");
        Usuario usuario3 = auth.cadastrar("joao@gmail.com", "password123");
        Usuario usuario4 = auth.cadastrar("ana@gmail.com", "qwerty");

        // Login de usuários
        auth.login("gabriel@gmail.com", "123456");
        auth.logout();
        auth.login("maria@gmail.com", "abcdef");
        auth.logout();
        auth.login("joao@gmail.com", "password123");
        auth.logout();
        auth.login("ana@gmail.com", "qwerty");

        // Exibir todos os usuários cadastrados
        for (Usuario usuario : UsuarioController.getInstancia().buscarTodos()) {
            System.out.println(usuario.toString());
        }

        System.out.println(GerenciarSessao.getInstancia().getUsuarioLogadoId());
    }
}
