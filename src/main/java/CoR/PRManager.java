package CoR;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class PRManager {

    private BranchManager branchManager;
    private RegionalDirector regionalDirector;
    private VicePresident vicePresident;
    private PresidentCEO presidentCEO;

    public static void main(String[] args) {
        PRManager prManager = new PRManager();
        prManager.createAuthorizationFlow();

        PurchaseRequest request = new PurchaseRequest(1, "Office Supplies", 10000);
        prManager.branchManager.authorize(request);

        request = new PurchaseRequest(2, "hardware", 175000);
        prManager.branchManager.authorize(request);

        request = new PurchaseRequest(3, "AD Campaign", 800000);
        prManager.branchManager.authorize(request);

    }

    private void createAuthorizationFlow() {
        branchManager = new BranchManager("Robin");
        regionalDirector = new RegionalDirector("Oscar");
        vicePresident = new VicePresident("kate");
        presidentCEO = new PresidentCEO("Drew");

        branchManager.setNextHandler(regionalDirector);
        regionalDirector.setNextHandler(vicePresident);
        vicePresident.setNextHandler(presidentCEO);
    }
}
