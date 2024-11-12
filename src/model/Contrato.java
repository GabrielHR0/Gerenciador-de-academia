package model;

import java.time.LocalDate;

public class Contrato {
    private Integer id;
    private Integer alunoid;
    private PlanoAssinatura planoAssinatura;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    // Construtor
    public Contrato(Integer id, Integer alunoid, PlanoAssinatura planoAssinatura, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.alunoid = alunoid;
        this.planoAssinatura = planoAssinatura;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Contrato(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }


    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer contratoid) {
        this.id = contratoid;
    }

    public Integer getAlunoid() {
        return alunoid;
    }

    public void setAlunoid(Integer alunoid) {
        this.alunoid = alunoid;
    }

    public PlanoAssinatura getPlanoAssinatura() {
        return planoAssinatura;
    }

    public void setPlanoAssinatura(PlanoAssinatura planoAssinatura) {
        this.planoAssinatura = planoAssinatura;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Contrato{" +
               "idContrato=" + id +
               ", aluno=" + alunoid +
               ", planoAssinatura=" + planoAssinatura +
               ", dataInicio=" + dataInicio +
               ", dataFim=" + dataFim +
               '}';
    }
}