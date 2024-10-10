package model;

import java.util.Date;
import java.util.List;

public class Treino {
    
    private Integer id;
    private String nome;
    private String descricao;
    private List<Exercicio> exercicios;
    private Instrutor instrutor;
    private Date dia;

    public Treino(String nome, String descricao, List<Exercicio> exercicios, Instrutor instrutor, Date dia){
        this.nome = nome;
        this.descricao = descricao;
        this.exercicios = exercicios;
        this.instrutor = instrutor;
        this.dia = dia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

}
