package service;

import java.time.LocalDate;
import model.Contrato;
import model.PlanoAssinatura;
import model.Aluno;
import repository.ContratoRepository;

public class ContratoService {

    private static ContratoService instancia;

    private ContratoService() {}

    public static ContratoService getInstancia() {

        if (instancia == null) {
            instancia = new ContratoService();
        }

        return instancia;
    }

    public Contrato cadastrarContrato() {
        Contrato novoContrato = new Contrato(LocalDate.now());

        try {
            Contrato contratoSalvo = ContratoRepository.getInstancia().salvar(novoContrato);

            if (contratoSalvo == null) {

                throw new IllegalStateException("Erro ao salvar o contrato: o repositório retornou um valor nulo.");
            }

            return contratoSalvo;

        } catch (Exception e) {

            throw new IllegalStateException("Erro ao salvar o contrato: " + e.getMessage(), e);
        }

    }

    /*(public Contrato associarContratoAoAluno(Contrato contrato, Aluno aluno) {

        if (contrato == null) {
            throw new IllegalArgumentException("Contrato não pode ser nulo.");
        }
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não pode ser nulo.");
        }

        contrato.setAlunoid(aluno.getId());

        return contrato;
    }*/

    public Contrato definirContratoAtual(Contrato contrato, Aluno aluno){
        if (contrato == null) {
            throw new IllegalArgumentException("Contrato não pode ser nulo.");
        }
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não pode ser nulo.");
        }

        contrato.setAlunoid(aluno.getId());
        aluno.setContratoAtualId(contrato.getId());

        return contrato;
    }

    public Contrato definirPlano(Contrato contrato, PlanoAssinatura plano) {
        if (contrato == null) {
            throw new IllegalArgumentException("Contrato não pode ser nulo.");
        }
        if (plano == null) {
            throw new IllegalArgumentException("Plano de assinatura não pode ser nulo.");
        }

        contrato.setPlanoAssinatura(plano);

        return contrato;
    }



}
