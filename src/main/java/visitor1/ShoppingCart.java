package visitor1;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<IVisitable> items;

    public ShoppingCart(ArrayList<IVisitable> items) {
        this.items = items;
    }

    public double getTotal(){
        PostageVisitor postageVisitor = new PostageVisitor();
        items.stream().forEach(t->t.accept(postageVisitor));

        return postageVisitor.getTotal();
    }
}
