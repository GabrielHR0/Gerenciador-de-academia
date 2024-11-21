package model;



public class PlanoAssinatura {
    private Integer id;
    private String nome;
    private Double valor;
    private Integer duracaoMeses;
    //private PlanoAssinaturaStrategy planoAssinaturaStrategy;

    public PlanoAssinatura(String nome, Double valor, Integer duracaoMeses) {
        this.nome = nome;
        this.valor = valor;
        this.duracaoMeses = duracaoMeses;
    }

    public PlanoAssinatura(){

    }
    // Métodos getters e setters
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

    //public void setPlanoAssinaturaStrategy(PlanoAssinaturaStrategy planoAssinaturaStrategy) {}
        

}
