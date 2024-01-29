import java.util.ArrayList;

public class task1GroceryListManager {
    private final ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here
    public void addItem(String item){
        if (!checkItem(item)){
            groceryList.add(item);
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
        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i);
            System.out.printf("%d. %s\n", i+1, item);
        } System.out.println();
    }
    public boolean checkItem(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        task1GroceryListManager a = new task1GroceryListManager();

        System.out.println();
        a.addItem("Banana");
        a.addItem("Apple");
        a.addItem("Chocolate");
        System.out.println();
        a.displayList();

        System.out.printf("Is \"Milk\" in the list? %b.\n", a.checkItem("Milk"));
        System.out.printf("Is \"Apple\" in the list? %b.\n", a.checkItem("Apple"));
        System.out.println();

        a.removeItem("Apple");
        a.removeItem("Chocolate");
        a.addItem("Juice");
        System.out.println();
        a.displayList();



    }
}
