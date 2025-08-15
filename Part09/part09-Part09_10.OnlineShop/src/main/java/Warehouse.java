import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);

    }

    public int price(String proudct) {
        if (!productPrices.containsKey(proudct))
            return -99;

        return productPrices.get(proudct);
    }

    public int stock(String product) {
        if (!productStock.containsKey(product))
            return 0;

        return productStock.get(product);
    }

    public boolean take(String product) {
        if (stock(product) == 0)
            return false;

        this.productStock.put(product, stock(product) - 1);
        return true;
    }

    public Set<String> products() {
        return productStock.keySet();
    }

}
