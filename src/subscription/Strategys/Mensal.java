package subscription.Strategys;

import service.TabelaPrecoService;
import subscription.PlanoAssinaturaStrategy;

public class Mensal implements PlanoAssinaturaStrategy{

    @Override
    public double calcularPreco(Integer tabelaPrecoId) {
        double valorMensal = TabelaPrecoService.getInstancia().buscarTabelaPorId(tabelaPrecoId).getValorMensal();
        double desconto = TabelaPrecoService.getInstancia().buscarTabelaPorId(tabelaPrecoId).getValorMensal();
        return valorMensal * obterDuracaoMeses() - (desconto * obterDuracaoMeses());
    }

    @Override
    public int obterDuracaoMeses() {
        return 1;
    }

    @Override
    public String descricao() {
        return "Plano Mensal";
    }

}
