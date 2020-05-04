
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cart = new ArrayList<>();

    public void add(String product, int price) {
        for (Item item : cart) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity();
                return;
            }
        }
        this.cart.add(new Item(product, 1, price));
    }

    public int price() {
        if (this.cart == null) {
            return 0;
        }
        int totalPrice = 0;
        for (Item item : cart) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item);

        }
    }

}
