public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Mansur Bank");

        Account acc1 = new SavingsAccount("12345", 1000.00);
        Account acc2 = new CheckingAccount("67890", 500.00);

        Customer cust1 = new Customer("Gamora", "C001");
        Customer cust2 = new Customer("Ali", "C002");

        // Add accounts to the bank
        bank.addAccount(acc1);
        bank.addAccount(acc2);

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

        // Perform transactions
        acc1.deposit(200);
        acc2.withdraw(150);

        // Display updated details
        acc1.display();
        acc2.display();

        // Sorting and displaying accounts
        bank.sortAccountsByBalanceDescending();
        bank.displayAllAccounts();
    }
}