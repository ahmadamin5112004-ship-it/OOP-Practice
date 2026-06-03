package java_discussion5;

public class WalletApp {


    static double deposit(double balance, double amount) {
        return balance + amount;
    }

    static double withdraw(double balance, double amount) {
        return balance - amount;
    }

    public static void main(String[] args) {

        double balance_1 = 100.0;
        double balance_2 = 250.0;

        balance_1 = deposit(balance_1, 50.0);
        balance_2 = withdraw(balance_2, 75.0);

        System.out.println("Task 1:");
        System.out.println("Balance 1 = " + balance_1);
        System.out.println("Balance 2 = " + balance_2);


        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet(500.0);

        w1.deposit(100.0);
        w1.withdraw(30.0);

        w2.deposit(200.0);
        w2.withdraw(50.0);

        System.out.println("\nTask 2 & 3:");
        System.out.println(w1);
        System.out.println(w2);
    }
}

class Wallet {
    private static int counter = 0;   
    private final int id;            
    private double balance;           


    public Wallet() {
        this.id = ++counter;
        this.balance = 0.0;
    }


    public Wallet(double initialBalance) {
        this.id = ++counter;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Wallet{id=" + id + ", balance=" + balance + "}";
    }
}