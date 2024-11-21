package controller;

import service.TabelaPrecoService;
import subscription.TabelaPreco;

public class TabelaPrecoController {
    
    private static TabelaPrecoController instancia;
    
    private TabelaPrecoController() {
        
    }
    
    public static TabelaPrecoController getInstancia() {
        if (instancia == null) {
            instancia = new TabelaPrecoController();
        }
        return instancia;
    
    }

    public TabelaPreco criarNovaTabelaPreco(double precoMensal, double descontoMensal){
        
        return TabelaPrecoService.getInstancia().adicionarTabelaPreco(precoMensal, descontoMensal);

    }

    public TabelaPreco buscarPorId(Integer id){

        return TabelaPrecoService.getInstancia().buscarTabelaPorId(id);

    }
}
