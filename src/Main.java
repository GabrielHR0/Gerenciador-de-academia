import controller.UsuarioController;

import model.Usuario;

public class Main {

    public static void main(String[] args) {


        UsuarioController usuarioController = UsuarioController.getInstancia();

        // Testando o cadastro de um novo usuário
        System.out.println("=== Teste: Cadastro de Usuário ===");
        Usuario usuario1 = usuarioController.cadastrar("gabriel@exemplo.com", "123456");
        if (usuario1 != null) {
            System.out.println("Usuário cadastrado com sucesso: " + usuario1);
        } else {
            System.out.println("Erro ao cadastrar o usuário.");
        }

        // Testando o cadastro de outro usuário
        Usuario usuario2 = usuarioController.cadastrar("ana@exemplo.com", "654321");
        if (usuario2 != null) {
            System.out.println("Usuário cadastrado com sucesso: " + usuario2);
        } else {
            System.out.println("Erro ao cadastrar o usuário.");
        }

        // Listar todos os usuários cadastrados
        System.out.println("\n=== Teste: Listar Todos os Usuários ===");
        for (Usuario u : usuarioController.buscarTodos()) {
            System.out.println(u);
        }

        Usuario usuario3 = usuarioController.cadastrar("ana@exemplo.com", "654321");
        System.out.println(usuario3);
    }
}