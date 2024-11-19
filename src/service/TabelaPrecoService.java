package service;

import java.util.List;
import java.util.stream.Collectors;

import subscription.TabelaPreco;
import repository.TabelaPrecoRepository;

public class TabelaPrecoService {

    private static TabelaPrecoService instancia;

    private TabelaPrecoService() {
    }

    public static TabelaPrecoService getInstancia() {
        if (instancia == null) {
            instancia = new TabelaPrecoService();
        }
        return instancia;
    }


    public TabelaPreco adicionarTabelaPreco(TabelaPreco tabelaPreco) {
        if (tabelaPreco == null) {
            throw new IllegalArgumentException("Tabela de preços não pode ser nula.");
        }
        if (tabelaPreco.getValorMensal() <= 0) {
            throw new IllegalArgumentException("O valor da tabela de preços deve ser maior que zero.");
        }
        return TabelaPrecoRepository.getInstancia().addTabelaPreco(tabelaPreco);
    }


    public TabelaPreco buscarTabelaPorId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID inválido para a tabela de preços.");
        }
        return TabelaPrecoRepository.getInstancia().buscarTabelaPorId(id);
    }

}