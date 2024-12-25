public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("12345", 1000.00);
        Account acc2 = new Account("67890", 500.00);

        Customer cust1 = new Customer("Gamora", "C001");
        Customer cust2 = new Customer("Ali", "C002");

        Bank bank = new Bank("Mansur Bank");

        // Display details
        acc1.display();
        acc2.display();
        cust1.display();
        cust2.display();
        bank.display();

        // Compare accounts
        if (acc1.getBalance() > acc2.getBalance()) {
            System.out.println(acc1.getAccountNumber() + " has a higher balance.");
        } else {
            System.out.println(acc2.getAccountNumber() + " has a higher balance.");
        }
    }
}
