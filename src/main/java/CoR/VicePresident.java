package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class VicePresident extends PRHandler{

    static double LIMIT = 200000;

    public VicePresident(String handlerName) {
        super(handlerName);
    }

    @Override
    public boolean authorize(PurchaseRequest purchaseRequest) {
        double amount = purchaseRequest.getAmount();
        if(amount <= LIMIT){
            System.out.println("V.P " + getHandlerName() + " has authorized PR - " + purchaseRequest);
            return true;
        }
        else {
            return getNextHandler().authorize(purchaseRequest);
        }
    }
}
