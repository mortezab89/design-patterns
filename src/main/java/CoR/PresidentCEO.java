package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class PresidentCEO extends PRHandler{

    static double LIMIT = 400000;

    public PresidentCEO(String handlerName) {
        super(handlerName);
    }

    @Override
    public boolean authorize(PurchaseRequest purchaseRequest) {
        double amount = purchaseRequest.getAmount();
        if(amount <= LIMIT ){
            System.out.println("CEO " + getHandlerName() + " has authorized the PR - " + purchaseRequest);
            return true;
        }
        else {
            System.out.println("Did not authorized. Reason: amount was too large");
        }
        return false;
    }
}
