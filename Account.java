class Account {
    private double balance;


    public Account() {
        balance = 0.0;
    }


    public Account(double initialBalance) {
        if (initialBalance >= 0)
            balance = initialBalance;
        else {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            balance = 0.0;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}