package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public abstract class PRHandler {

    private PRHandler nextHandler;

    private String handlerName;

    public PRHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public abstract boolean authorize(PurchaseRequest purchaseRequest);

    public PRHandler getNextHandler(){
        return nextHandler;
    }

    public void setNextHandler(PRHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
