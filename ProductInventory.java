import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        inventory.put(101, 50);
        inventory.put(102, 30);
        inventory.put(103, 20);

        System.out.println("Initial Inventory:");
        displayInventory(inventory);

        inventory.put(101, 75); // Update quantity
        inventory.remove(102); // Remove product

        System.out.println("\nFinal Inventory:");
        displayInventory(inventory);
    }

    private static void displayInventory(HashMap<Integer, Integer> inventory) {
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() +
                               ", Quantity: " + entry.getValue());
        }
    }
}
