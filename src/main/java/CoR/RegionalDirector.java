package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class RegionalDirector extends PRHandler{

    static double LIMIT = 100000;

    public RegionalDirector(String handlerName) {
        super(handlerName);
    }

    @Override
    public boolean authorize(PurchaseRequest purchaseRequest) {
        double amount = purchaseRequest.getAmount();
        if(amount <= LIMIT){
            System.out.println(" Regional Director " + getHandlerName() + " has authorized the PR - " + purchaseRequest);
            return true;
        }
        else {
            return getNextHandler().authorize(purchaseRequest);
        }
    }
}
