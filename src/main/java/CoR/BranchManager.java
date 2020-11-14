package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class BranchManager extends PRHandler {

    static double LIMIT = 25000;

    public BranchManager(String handlerName) {
        super(handlerName);
    }

    @Override
    public boolean authorize(PurchaseRequest purchaseRequest) {
        double amount = purchaseRequest.getAmount();
        if(amount<= LIMIT){
            System.out.println("Brand manager " + getHandlerName() + "has authorized the PR - " + purchaseRequest );
            return true;
        }
        else
            return getNextHandler().authorize(purchaseRequest);

    }
}
