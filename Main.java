import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        // Sample accounts
        bank.addAccount(new Account(101, "Alice", 1000));
        bank.addAccount(new Account(102, "Bob", 500));

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Show All Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bank.showAllAccounts();
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    Account accD = bank.findAccount(sc.nextInt());
                    if (accD != null) {
                        System.out.print("Enter amount to deposit: ");
                        accD.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    Account accW = bank.findAccount(sc.nextInt());
                    if (accW != null) {
                        System.out.print("Enter amount to withdraw: ");
                        accW.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    Account accB = bank.findAccount(sc.nextInt());
                    if (accB != null) {
                        System.out.println("Balance: " + accB.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    Account accT = bank.findAccount(sc.nextInt());
                    if (accT != null) {
                        accT.showTransactions();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Bank System. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}