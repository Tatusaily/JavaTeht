import java.util.HashMap;

public class task2GroceryList {
    private final HashMap<String, Double> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, Double cost){
        if (!checkItem(item)){
            groceryList.put(item, cost);
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
            Double cost = groceryList.get(item);
            System.out.printf("%s. %.2f\n", item, cost);
        } System.out.println();
    }
    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }
    public double calculateTotalCost(){
        double sum = 0;
        for (Double cost : groceryList.values()){
            sum += cost;
        }return sum;
    }

    public static void main(String[] args) {
        task2GroceryList a = new task2GroceryList();

        System.out.println();
        a.addItem("Banana", 0.2);
        a.addItem("Apple", 0.3);
        a.addItem("Chocolate", 1.0);
        System.out.println();
        a.displayList();

        System.out.printf("Is \"Milk\" in the list? %b.\n", a.checkItem("Milk"));
        System.out.printf("Is \"Apple\" in the list? %b.\n", a.checkItem("Apple"));
        System.out.println();

        a.removeItem("Chocolate");
        a.addItem("Juice", 1.5);
        System.out.println();
        a.displayList();

        System.out.printf("Total cost of the list is: %.2f €", a.calculateTotalCost());

    }
}
