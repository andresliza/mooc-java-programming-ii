import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> productMap;

    public ShoppingCart() {
        this.productMap = new HashMap<>();
    }

    public void add(String product, int price) {
        Item toAdd = new Item(product, 1, price);

        if (this.productMap.containsKey(product)) {
            this.productMap.get(product).increaseQuantity();
        } else {
            this.productMap.put(product, toAdd);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : this.productMap.values()) {
            totalPrice += item.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Item item : this.productMap.values()) {
            System.out.println(item);
        }
    }
}
