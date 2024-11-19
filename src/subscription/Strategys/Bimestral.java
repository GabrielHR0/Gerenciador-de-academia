package subscription.Strategys;

import subscription.PlanoAssinaturaStrategy;

public class Bimestral implements PlanoAssinaturaStrategy {

    @Override
    public double calcularPreco() {
        double valorMensal = TabelaPrecoService.getInstancia().buscarTabelaPorId(tabelaPrecoId).getValorMensal();
        double desconto = TabelaPrecoService.getInstancia().buscarTabelaPorId(tabelaPrecoId).getValorMensal();
        return valorMensal * obterDuracaoMeses() - (desconto * obterDuracaoMeses());
    }

    @Override
    public int obterDuracaoMeses() {
        return 2;
    }

    @Override
    public String descricao() {
        return "Plano Bimestral";
    }
}
