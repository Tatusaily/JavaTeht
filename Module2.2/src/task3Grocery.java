import java.util.HashMap;
import java.util.Objects;

public class task3Grocery{
    private final HashMap<String, String> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, String category){
        if (!checkItem(item)){
            groceryList.put(item, category);
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
            System.out.printf("%s.\n", item);
        } System.out.println();
    }
    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }
    public void displayByCategory(String cat){
        System.out.printf("Items with the category %s are:\n", cat);
        for (String item : groceryList.keySet()){
            if (Objects.equals(groceryList.get(item), cat)){
                System.out.printf("%s.\n", item);
            }
        }
    }

    public static void main(String[] args) {
        task3Grocery a = new task3Grocery();

        System.out.println();
        a.addItem("Banana", "Fruit");
        a.addItem("Apple", "Fruit");
        a.addItem("Chocolate", "Snack");
        a.addItem("Juice", "Drink");
        System.out.println();
        a.displayList();
        a.displayByCategory("Fruit");

    }
}
