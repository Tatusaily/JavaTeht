package Task2;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1, 0.5);
        assert cart.getItems().size() == 1;
    }
    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1, 0.5);
        cart.removeItem("Apple");
        assert cart.getItems().size() == 0;
    }
    @Test
    public void testGetTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1, 0.5);
        cart.addItem("Banana", 2, 0.5);
        cart.addItem("Water", 3.2, 0.12);
        assert cart.getTotal() == 1.884;
    }

}
