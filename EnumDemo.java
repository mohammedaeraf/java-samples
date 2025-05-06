enum OrderStatus {
    PLACED, // Order has been placed
    SHIPPED, // Order has been shipped
    OUTFORDELIVERY, // Order out for Delivery
    DELIVERED, // Order has been delivered
    CANCELLED // Order has been cancelled
}

class Order {
    private String orderId;
    private OrderStatus status;

    // Constructor to initialize Order with ID and status
    public Order(String orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    // Method to get the status of the order
    public OrderStatus getStatus() {
        return status;
    }

    // Method to update the status of the order
    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    // Display the order details
    public void displayOrderInfo() {
        System.out.println("Order ID: " + this.orderId + ", Status: " + this.status);
    }
}

public class EnumDemo {

    public static void main(String[] args) {

        // Create a new order with status "PLACED"
        Order order1 = new Order("ORD12345", OrderStatus.PLACED);

        // Display initial order status
        System.out.println("Initial Order Status:");
        order1.displayOrderInfo();

        // Update order status to "SHIPPED"
        order1.updateStatus(OrderStatus.SHIPPED);
        System.out.println("\nUpdated Order Status:");
        order1.displayOrderInfo();

        // Update order status to "OUTFORDELIVERY"
        order1.updateStatus(OrderStatus.OUTFORDELIVERY);
        System.out.println("\nUpdated Order Status:");
        order1.displayOrderInfo();

        // Update order status to "DELIVERED"
        order1.updateStatus(OrderStatus.DELIVERED);
        System.out.println("\nFinal Order Status:");
        order1.displayOrderInfo();
    }
}
