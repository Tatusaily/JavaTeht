package Task2;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    private final HashMap<String, ArrayList<Double>> items = new HashMap<>();
    void addItem(String name, double quantity, double price) {
        // Add the item to the cart
        // Stored in "name" "quantity" "price" format.
        ArrayList<Double> value = new ArrayList<>();
        value.add(quantity);
        value.add(price);
        items.put(name, value);
    }
    void removeItem(String name) {
        // Remove the item from the cart
        items.remove(name);
    }
    HashMap<String, ArrayList<Double>> getItems() {
        return items;
    }
    double getTotal() {
        // Calculate the total cost of the items in the cart
        double total = 0;
        for (ArrayList<Double> value : items.values()) {
            total += value.get(0) * value.get(1);
        }
        return total;
    }
}
