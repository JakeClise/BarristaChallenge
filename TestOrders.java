public class TestOrders {
    public static void main(String[] args) {
        
        //Create Items
        Item item1 = new Item("latte", 4.50);
        Item item2 = new Item("capuccino", 3.75);
        Item item3 = new Item("mocha", 5.25);
        Item item4 = new Item("Frappe", 6.50);

        //Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        //Create 3 named orders
        Order order3 = new Order("John");
        Order order4 = new Order("Ken");
        Order order5 = new Order("Phil");

        //Add at least 2 items to each of the orders
        order3.addItem(item4);
        order3.addItem(item2);

        order4.addItem(item1);
        order4.addItem(item3);

        order5.addItem(item4);
        order5.addItem(item1);

        order3.displayOrder();        

    }
}
