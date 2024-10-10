package model;

public class PlanoAssinatura {
    private Integer idPlano;
    private String descricao;
    private Double valor;
    private Integer duracaoMeses;

    
    public PlanoAssinatura(Integer idPlano, String descricao, Double valor, Integer duracaoMeses) {
        this.idPlano = idPlano;
        this.descricao = descricao;
        this.valor = valor;
        this.duracaoMeses = duracaoMeses;
    }

    // Getters e Setters
    public Integer getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "PlanoAssinatura{" +
               "idPlano=" + idPlano +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               ", duracaoMeses=" + duracaoMeses +
               '}';
    }
}
