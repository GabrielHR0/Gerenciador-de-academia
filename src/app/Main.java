package app;

import controller.AlunoController;
import controller.FaturaController;
import controller.OpcaoFaturamentoController;
import controller.PlanoAssinaturaController;
import controller.ContratoController;
import controller.TabelaPrecoController;

import model.Aluno;
import model.Fatura;
import model.Contrato;
import model.PlanoAssinatura;
import payment.OpcaoFaturamento;
import subscription.TabelaPreco;

public class Main {

    public static void main(String[] args) {
        // 1. Criar e cadastrar um aluno
        Aluno ana = AlunoController.getInstancia().cadastrarAluno("Ana Martins", "123.456.789-00", "987654321", "ana.martins@example.com");
        System.out.println("Aluno cadastrado: " + ana);

        // 2. Criar contrato para o aluno
        Contrato contratoAna = ContratoController.getInstancia().cadastrar();
        ContratoController.getInstancia().contratar(contratoAna, ana);
        System.out.println("Contrato criado: " + contratoAna);

        // 3. Criar tabela de preço e plano de assinatura
        TabelaPreco tabela = TabelaPrecoController.getInstancia().criarNovaTabelaPreco(180.0, 0.3);
        PlanoAssinatura plano = PlanoAssinaturaController.getInstancia().cadastrarPlanoAssinatura(3, "Mensal", tabela.getId());
        ContratoController.getInstancia().definirPlano(contratoAna, plano);

        // 4. Gerar uma fatura para o aluno
        System.out.println(plano);

        System.out.println("Contrato criado: " + contratoAna);
        
        OpcaoFaturamento anao = OpcaoFaturamentoController.getInstancia().cadastrarOpcaoFaturamento(15, ana.getId());

        System.out.println(anao.getId());

        OpcaoFaturamentoController.getInstancia().buscarPorId(anao.getId());
        System.out.println(OpcaoFaturamentoController.getInstancia().buscarFaturamentoPorAlunoId(ana.getId()));


        Fatura faturaana = FaturaController.getInstancia().gerarFatura(ana.getId());
        
        System.out.println(faturaana);
        
       
    }
}
