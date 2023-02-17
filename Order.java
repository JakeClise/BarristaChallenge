import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //Constructor
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    //Overloaded Constructor
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //Methods
    //addItem
    public void addItem(Item item){
        items.add(item);
    }

    //getStatusMessage  
    public String getStatusMessage(){
        if (ready == true) {
            return "Your order is ready!";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    //getOrderTotal
    public double getOrderTotal() {
        double total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    //displayOrder
    public void displayOrder() {
        System.out.println("Customer Name: " + getName());
        for (Item item : items){
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println("Total: " + getOrderTotal());
    }
    

    //Getters
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    
}
