import java.util.Scanner;

public class Bank {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amountOfMoney) {
        if (amountOfMoney <= 0) {
            System.out.println("Invalid Number");
        } else {
            this.balance += amountOfMoney;
            System.out.println("Deposit was successful! Now your balance is " + getBalance());
        }
    }

    public void withdraw(double amountOfMoney) {
        if (amountOfMoney <= 0) {
            System.out.println("Invalid Number");
        } else if (amountOfMoney > balance) {
            System.out.println("Limit is exceeded");
        } else {
            this.balance -= amountOfMoney;
            System.out.println("Withdraw was successful! Now your balance is " + getBalance());
        }
    }
}
