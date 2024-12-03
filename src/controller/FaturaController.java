package controller;

import java.util.List;
import model.Fatura;
import service.FaturaService;

public class FaturaController {

    private static FaturaController instancia;

    private FaturaController() {
    }

    public static FaturaController getInstancia() {
        if (instancia == null) {
            instancia = new FaturaController();
        }
        return instancia;
    }

    public Fatura gerarFatura(Integer alunoId) {
        return FaturaService.getInstancia().gerarFatura(alunoId);
    }

    public List<Fatura> buscarTodasFaturas() {
        return FaturaService.getInstancia().buscarTodasFaturas();
    }

    public Fatura deletarFatura(Integer id) {
        return FaturaService.getInstancia().deletarFatura(id);
    }
}
