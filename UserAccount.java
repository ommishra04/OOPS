package Own;

import Experiment6.BankAccount;

public class UserAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000); // Accessible

        // The following lines will give errors due to access modifiers:
        // account.withdraw(500);       // ❌ protected - not accessible from different package
        // account.checkBalance();      // ❌ default - not accessible from different package
        // account.calculateInterest(); // ❌ private - not accessible at all
    }
}

