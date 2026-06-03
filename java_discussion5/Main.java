package java_discussion5;

public class Main {

    // Task 01: Procedural functions
    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        return balance - amount;
    }

    // Task 05: addBonus utility method
    public static void addBonus(Wallet w, double amount) {
        w.deposit(amount);
    }

    // Task 05: try swapping wallets
    public static void swap(Wallet a, Wallet b) {
        Wallet temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

      
        // Task 01: Procedural version
   
        double balance_1 = 500;
        double balance_2 = 300;

        balance_1 = deposit(balance_1, 100);
        balance_2 = withdraw(balance_2, 50);

        System.out.println("Task 01:");
        System.out.println("Balance 1 = " + balance_1);
        System.out.println("Balance 2 = " + balance_2);

    
        // Task 02 + 03 + 04
      
        Wallet w1 = new Wallet();       
        Wallet w2 = new Wallet(1000);  

        w1.deposit(200);
        w1.withdraw(50);               
        w2.deposit(300);
        w2.withdraw(100, "ATM");       

        System.out.println("\nTask 02,03,04:");
        System.out.println("Wallet 1 ID: " + w1.getId());
        System.out.println("Wallet 1 Balance: " + w1.getBalance());
        System.out.println("Wallet 1 Last Mode: " + w1.getLastWithdrawMode());

        System.out.println();

        System.out.println("Wallet 2 ID: " + w2.getId());
        System.out.println("Wallet 2 Balance: " + w2.getBalance());
        System.out.println("Wallet 2 Last Mode: " + w2.getLastWithdrawMode());

     
        // Task 05: addBonus
 
        addBonus(w1, 100);

        System.out.println("\nTask 05: Bonus Added");
        System.out.println("Wallet 1 Balance after bonus: "
                           + w1.getBalance());


        // Task 05: swap check
     
        System.out.println("\nBefore Swap:");
        System.out.println("w1 Balance = " + w1.getBalance());
        System.out.println("w2 Balance = " + w2.getBalance());

        swap(w1, w2);

        System.out.println("\nAfter Swap Attempt:");
        System.out.println("w1 Balance = " + w1.getBalance());
        System.out.println("w2 Balance = " + w2.getBalance());

        System.out.println("\nSwap did not work because Java is pass-by-value.");
    }
}



class Wallet {

    // Task 03: unique id using counter
    private static int counter = 0;
    private final int id;

    // Task 02: private balance
    private double balance;

    // Task 04: last withdraw mode
    private String lastWithdrawMode;

    // Task 03: default constructor
    public Wallet() {
        this.id = ++counter;
        this.balance = 0;
        this.lastWithdrawMode = "NONE";
    }

    // Task 03: constructor with balance
    public Wallet(double balance) {
        this.id = ++counter;
        this.balance = balance;
        this.lastWithdrawMode = "NONE";
    }

    // Task 02: deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Task 04: normal withdraw
    public void withdraw(double amount) {
        this.balance -= amount;
        this.lastWithdrawMode = "NORMAL";
    }

    // Task 04: overloaded withdraw
    public void withdraw(double amount, String mode) {
        this.balance -= amount;
        this.lastWithdrawMode = mode;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getLastWithdrawMode() {
        return lastWithdrawMode;
    }
}