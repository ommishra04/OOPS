package Experiment4;

class Customer {
    private double balance;

    public Customer() {
        this.balance = 0.0;
    }

    public void addBalance(double amount) {
        balance += amount;
        System.out.println("Added: " + amount);
    }

    public void addBalance(int amount) {
        balance += amount;
        System.out.println("Added: " + amount);
    }

    protected void deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.addBalance(100.50);
        cust.addBalance(50);
        cust.deductBalance(30);
        cust.showBalance();
    }
}

