package subscription.Strategys;

import subscription.PlanoAssinaturaStrategy;

public class Bimestral implements PlanoAssinaturaStrategy {

    @Override
    public double calcularPreco() {
        return 180.0 * obterDuracaoMeses() * 0.95; 
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
