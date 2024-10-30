package model;

import java.util.Date;

public class Contrato {
    private Integer idContrato;
    private Aluno aluno;
    private PlanoAssinatura planoAssinatura;
    private Date dataInicio;
    private Date dataFim;

    // Construtor
    public Contrato(Integer idContrato, Aluno aluno, PlanoAssinatura planoAssinatura, Date dataInicio, Date dataFim) {
        this.idContrato = idContrato;
        this.aluno = aluno;
        this.planoAssinatura = planoAssinatura;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e Setters
    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Contrato{" +
               "idContrato=" + idContrato +
               ", aluno=" + aluno +
               ", planoAssinatura=" + planoAssinatura +
               ", dataInicio=" + dataInicio +
               ", dataFim=" + dataFim +
               '}';
    }
}