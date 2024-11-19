package subscription;

public interface PlanoAssinaturaStrategy {

    double calcularPreco(Integer tabelaPrecoId);
    int obterDuracaoMeses();
    String descricao();

}
