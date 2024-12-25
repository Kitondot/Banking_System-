public class Customer {
    private String name;
    private String customerId;

    // Constructor
    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Display customer details
    public void display() {
        System.out.println("Customer ID: " + customerId + ", Name: " + name);
    }
}
