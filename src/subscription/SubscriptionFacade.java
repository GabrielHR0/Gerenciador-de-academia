package subscription;

import controller.PlanoAssinaturaController;
import controller.TabelaPrecoController;
import model.PlanoAssinatura;

public class SubscriptionFacade {

    private static SubscriptionFacade instancia;

    PlanoAssinaturaController controller = PlanoAssinaturaController.getInstancia();
    TabelaPrecoController tabelaPrecoController = TabelaPrecoController.getInstancia();

    private SubscriptionFacade() {
    }
    
    public static SubscriptionFacade getInstancia() {
        if (instancia == null) {
            instancia = new SubscriptionFacade();
        }
        return instancia;
    }



}
