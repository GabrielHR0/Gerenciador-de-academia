package model;

import subscription.PlanoAssinaturaStrategy;

public class PlanoAssinatura {
    private Integer idPlano;
    private String nome;
    private Double valor;
    private Integer duracaoMeses;
    private PlanoAssinaturaStrategy planoAssinaturaStrategy;

    // Construtor
    public PlanoAssinatura(String nome, PlanoAssinaturaStrategy planoAssinaturaStrategy) {
        this.nome = planoAssinaturaStrategy.descricao();
        this.planoAssinaturaStrategy = planoAssinaturaStrategy;
        this.valor = planoAssinaturaStrategy.calcularPreco(); 
        this.duracaoMeses = planoAssinaturaStrategy.obterDuracaoMeses(); 
    }

    // Métodos getters e setters
    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(Integer duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public void setPlanoAssinaturaStrategy(PlanoAssinaturaStrategy planoAssinaturaStrategy) {
        this.planoAssinaturaStrategy = planoAssinaturaStrategy;
        this.valor = planoAssinaturaStrategy.calcularPreco();
        this.duracaoMeses = planoAssinaturaStrategy.obterDuracaoMeses();
    }
}
