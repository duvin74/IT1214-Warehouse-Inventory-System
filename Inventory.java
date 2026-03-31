import java.util.*;

public class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add Item
    public void addItem(Item item) {
        if (items.containsKey(item.getItemId())) {
            System.out.println("Item already exists!");
        } else {
            items.put(item.getItemId(), item);
            System.out.println("Item added successfully.");
        }
    }

    // Remove Item
    public void removeItem(String itemId) {
        if (items.remove(itemId) != null) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update Quantity
    public void updateQuantity(String itemId, int quantity) {
        Item item = items.get(itemId);
        if (item != null) {
            item.setQuantity(quantity);
            System.out.println("Quantity updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by ID
    public void searchById(String itemId) {
        Item item = items.get(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by Name
    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Display All
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}