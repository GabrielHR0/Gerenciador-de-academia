package model;

import java.time.LocalDate;

public class Instrutor extends Pessoa{

    public Instrutor(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
    }

    private Boolean ativo;
    private LocalDate dataAdmicao;

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataAdmicao() {
        return dataAdmicao;
    }

    public void setDataAdmicao(LocalDate dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }
    
}
