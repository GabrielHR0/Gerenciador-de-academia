package payment;

import java.time.LocalDate;

public class OpcaoFaturamento {
    
    private Integer id;
    private int diaFechamento;
    private int diaVencimento;


    public OpcaoFaturamento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDiaFechamento() {
        return diaFechamento;
    }

    public void setDataFechamento(int dataFechamento) {
        this.diaFechamento = dataFechamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.diaVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "OpcaoFaturamento{" +
                "id=" + id +
                ", diaFechamento=" + diaFechamento +
                ", diaVencimento=" + diaVencimento +
                '}';
    }
}
