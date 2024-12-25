public class Bank {
    private String bankName;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Getter and Setter
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // Display bank details
    public void display() {
        System.out.println("Bank: " + bankName);
    }
}
