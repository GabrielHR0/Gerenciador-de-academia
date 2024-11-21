package app;

import auth.AuthenticationFacade;
import auth.AuthenticationController;
import auth.GerenciarSessao;
import controller.AlunoController;
import controller.ContratoController;
import controller.PlanoAssinaturaController;
import controller.TabelaPrecoController;
import controller.UsuarioController;
import model.Aluno;
import model.Contrato;
import model.PlanoAssinatura;
import model.Usuario;
import subscription.TabelaPreco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        AuthenticationFacade.getInstancia().initRepository();

        Usuario anau = UsuarioController.getInstancia().buscarPorEmail("ana.martins@example.com");
        Aluno ana = AlunoController.getInstancia().cadastrarAluno(null, null, null, "ana.martins@example.com");

        UsuarioController.getInstancia().PessoaUsuarioLink(anau.getId(), ana.getId());

        Contrato contratoAna = ContratoController.getInstancia().cadastrar();
        ContratoController.getInstancia().contratar(contratoAna, ana);

        System.out.println(anau);

        System.out.println(UsuarioController.getInstancia().buscarPorId(2));
        TabelaPreco tabela = TabelaPrecoController.getInstancia().criarNovaTabelaPreco(180.0, 0.3);
        
        PlanoAssinatura plano = PlanoAssinaturaController.getInstancia().cadastrarPlanoAssinatura(3, "Mensal", tabela.getId());
   
        ContratoController.getInstancia().definirPlano(contratoAna, plano);

        System.out.println(ContratoController.getInstancia().buscarPorId(ana.getContratoAtualId()));


        System.out.println(TabelaPrecoController.getInstancia().buscarPorId(1));




        

    }
}
