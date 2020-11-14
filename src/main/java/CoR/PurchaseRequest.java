package CoR;

import java.util.StringJoiner;

/**
 * @author m.bandidarian on 11/14/2020
 */
public class PurchaseRequest {

    private int ID;
    private String description;
    private double amount;

    public PurchaseRequest(int ID, String description, double amount) {
        this.ID = ID;
        this.description = description;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PurchaseRequest.class.getSimpleName() + "[", "]")
                .add("ID=" + ID)
                .add("description='" + description + "'")
                .add("amount=" + amount)
                .toString();
    }
}
