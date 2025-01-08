import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bank {
    private String bankName;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void addAccount(Account account) {
        if (searchByAccountNumber(account.getAccountNumber()) == null) {
            accounts.add(account);
        } else {
            System.out.println("Account " + account.getAccountNumber() + " already exists.");
        }
    }

    public void sortAccountsByBalanceDescending() {
        Collections.sort(accounts, (a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()));
    }

    public Account searchByAccountNumber(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.display();
        }
    }

    public void display() {
        System.out.println(this);  // Используем toString() для отображения информации о банке
        System.out.println("Accounts:");
        displayAllAccounts();
    }

    @Override
    public String toString() {
        return "Bank: " + bankName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bank bank = (Bank) obj;
        return bankName.equals(bank.bankName);
    }

    @Override
    public int hashCode() {
        return bankName.hashCode();
    }
}
