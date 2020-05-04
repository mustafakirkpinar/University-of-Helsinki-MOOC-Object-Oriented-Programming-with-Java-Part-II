
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> mapPrice = new HashMap();
    private Map<String, Integer> mapStock = new HashMap();

    public void addProduct(String product, int price, int stock) {
        this.mapPrice.put(product, price);
        this.mapStock.put(product, stock);
    }

    public int price(String product) {
        if (!this.mapPrice.containsKey(product)) {
            return -99;
        }
        return this.mapPrice.get(product);
    }

    public Set<String> products() {
        return this.mapPrice.keySet();
    }

    public int stock(String product) {
        if (this.mapStock.get(product) == null) {
            return 0;
        }
        return this.mapStock.get(product);
    }

    public boolean take(String product) {
        if (!this.mapStock.containsKey(product)) {
            return false;
        }
        if (this.mapStock.get(product) <= 0) {
            return false;
        }
        int oldStock = this.mapStock.get(product);
        this.mapStock.put(product, --oldStock);
        return true;
    }
}
