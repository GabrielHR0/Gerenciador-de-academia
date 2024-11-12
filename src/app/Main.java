package app;

import auth.Authentication;
import auth.AuthenticationController;
import auth.GerenciarSessao;
import controller.AlunoController;
import controller.ContratoController;
import controller.UsuarioController;
import model.Aluno;
import model.Contrato;
import model.PlanoAssinatura;
import model.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário

        while (true) {
            // Passo 1: Inicializar o repositório
            System.out.println("Passo 1: Inicializando o repositório...");
            Authentication.getInstancia().initRepository();
            System.out.println("Repositório inicializado!");

            // Passo 2: Cadastrar o usuário "gabriel"
            System.out.println("Passo 2: Cadastrando o usuário 'gabriel'...");
            Usuario gabriel = Authentication.getInstancia().controller.cadastrar("gabriel", "123");
            System.out.println("Usuário 'gabriel' cadastrado: " + gabriel);

            // Passo 3: Verificar se os usuários existem
            System.out.println("Passo 3: Verificando se os usuários existem...");
            System.out.println("Usuário 'wilson.moura@example.com' existe? " + UsuarioController.getInstancia().existe("wilson.moura@example.com"));
            System.out.println("Usuário 'gabriel' existe? " + UsuarioController.getInstancia().existe("gabriel"));

            // Passo 4: Fazer o login do usuário 'gabriel'
            System.out.println("Passo 4: Realizando o login do usuário 'gabriel'...");
            Authentication.getInstancia().controller.login("gabriel", "123");
            System.out.println("Login realizado com sucesso para 'gabriel'!");
            Authentication.getInstancia().controller.logout();
            Authentication.getInstancia().controller.login("olga.rocha@example.com", "senha15");
            

            // Pergunta ao usuário se ele quer continuar com o próximo ciclo
            System.out.print("Deseja continuar com o próximo ciclo? (s/n): ");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Processo encerrado.");
                break; // Sai do loop caso o usuário não queira continuar
            }

            System.out.println("\n--------------------\n"); // Separação entre os ciclos
        }
    }
}
