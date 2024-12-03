package model;

import java.time.LocalDate;

import payment.FaturaStatus;
import payment.OpcaoFaturamento;

public class Fatura {

    private Integer id;
    private Double valorTotal;
    private LocalDate dataDeFechamento;
    private LocalDate dataDeVencimento;
    private FaturaStatus status;

    private Integer AlunoId;


    public Fatura(Double valorTotal, LocalDate dataDeFechamento, LocalDate dataDeVencimento, FaturaStatus status) {
        this.valorTotal = valorTotal;
        this.dataDeFechamento = dataDeFechamento;
        this.dataDeVencimento = dataDeVencimento;
        this.status = status;
    }
    
    public FaturaStatus getStatus() {
        return status;
    }

    public void setStatus(FaturaStatus status) {
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataDeFechamento() {
        return dataDeFechamento;
    }

    public void setDataDeFechamento(LocalDate dataDeFechamento) {
        this.dataDeFechamento = dataDeFechamento;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Integer getAlunoId() {
        return AlunoId;
    }

    public void setAlunoId(Integer alunoId) {
        AlunoId = alunoId;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "id=" + id +
                ", valorTotal=" + valorTotal +
                ", dataDeFechamento=" + dataDeFechamento +
                ", dataDeVencimento=" + dataDeVencimento +
                ", status=" + status +
                '}';
    }
    

}
