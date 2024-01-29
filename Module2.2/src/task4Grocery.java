import java.util.HashMap;
import java.util.Objects;

public class task4Grocery {
    private final HashMap<String, Integer> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, int quantity){
        if (!checkItem(item)){
            groceryList.put(item, quantity);
            System.out.printf("Added %s to the list.\n", item);
        }else System.out.printf("%s already in the list.\n", item);
    }
    public void removeItem(String item){
        if (checkItem(item)){
            groceryList.remove(item);
            System.out.printf("%s Removed from the list.\n", item);
        }else System.out.printf("%s Not found in the list.\n", item);
    }
    public void displayList(){
        for (String item : groceryList.keySet()) {
            int quantity = groceryList.get(item);
            System.out.printf("%s. x %d\n", item, quantity);
        } System.out.println();
    }
    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }
    public void updateQuantity(String item, int quantity){
        if (checkItem(item)){
            groceryList.put(item, quantity);
        }
    }
    public void displayItems(){
        for (String item : groceryList.keySet()) {
            int quantity = groceryList.get(item);
            if(quantity > 0){
                System.out.printf("%s. x %d\n", item, quantity);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task4Grocery a = new task4Grocery();

        System.out.println();
        a.addItem("Banana", 5);
        a.addItem("Apple", 3);
        a.addItem("Chocolate", 2);
        a.addItem("Juice", 2);
        System.out.println();
        a.displayItems();
        a.updateQuantity("Banana", 0);
        a.displayItems();

    }
}
