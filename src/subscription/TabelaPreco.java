package subscription;

public class TabelaPreco {
    
    private Integer id;
    private double valorMensal;
    private double desconto;


    public TabelaPreco(double valorMensal, double desconto) {
        this.valorMensal = valorMensal;
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public double getValorMensal() {
        return valorMensal;
    }
    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }


}
