package model;

public abstract class Pessoa {

    private Integer id;
    private String nomeCompleto;
    private String cpf;
    private String telefone;
    private String email;


    public Pessoa(String nome, String cpf, String telefone, String email) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nome) {
        this.nomeCompleto = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
