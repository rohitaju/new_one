public class accountbalance {

    public static void main(String[] args) {
        // Using no-arg constructor
        Account acc1 = new Account();
        acc1.deposit(5000);
        acc1.withdraw(1500);
        acc1.displayBalance();

        System.out.println("----------------");

        // Using parameterized constructor
        Account acc2 = new Account(10000);
        acc2.deposit(2000);
        acc2.withdraw(12000);
        acc2.displayBalance();
    }
}