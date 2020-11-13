package visitor1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IVisitable> items = new ArrayList<>();
        items.add(new Book(20,2));
        items.add(new CD(5,0.1));
        items.add(new DVD(5,0.2));

        ShoppingCart shoppingCart = new ShoppingCart(items);
        double total = shoppingCart.getTotal();
        System.out.println(total);
    }
}
