import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber = 1;

    public Order(CafeCustomer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double sum = 0;
        for (MenuItem item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public int countItems() {
        return items.size();
    }

    public void markAsPaid() {
        paid = true;
    }

    @Override
    public String toString() {
        return "Order #" + orderNumber +
                "\nCustomer: " + customer.getFirstName() + " " + customer.getLastName() +
                "\nItems: " + items +
                "\nTotal: " + calculateTotal() +
                "\nPaid: " + paid + "\n";
    }
}