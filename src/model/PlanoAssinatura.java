package model;

public class PlanoAssinatura {
    private Integer idPlano;
    private String nome;
    private Double valor;
    private Integer duracaoMeses;

    
    public PlanoAssinatura(Integer idPlano, String nome, Double valor, Integer duracaoMeses) {
        this.idPlano = idPlano;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "PlanoAssinatura{" +
               "idPlano=" + idPlano +
               ", descricao='" + nome + '\'' +
               ", valor=" + valor +
               ", duracaoMeses=" + duracaoMeses +
               '}';
    }
}
