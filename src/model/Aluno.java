package model;

import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
    }

    private Long matricula;
    private LocalDate dataMatricula;

    private List<Contrato> contratos;

    
}
