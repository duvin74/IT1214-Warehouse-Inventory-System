public class Item {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    // Constructor
    public Item(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "ID: " + itemId +
               ", Name: " + itemName +
               ", Quantity: " + quantity +
               ", Price: " + price;
    }
}