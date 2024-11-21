package app;

import auth.AuthenticationFacade;
import subscription.SubscriptionFacade;

public class ApplicationFacade{
    
    private static ApplicationFacade instancia;

    SubscriptionFacade subscription = SubscriptionFacade.getInstancia();
    AuthenticationFacade authentication = AuthenticationFacade.getInstancia();

    private ApplicationFacade() {
    }
    
    public static ApplicationFacade getInstancia() {
        if (instancia == null) {
            instancia = new ApplicationFacade();
        }
        return instancia;
    }

}