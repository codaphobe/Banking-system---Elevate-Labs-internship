import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountManager manager = new AccountManager();
        Account currentAccount = null;

        while (true) {
            System.out.println("\n=== Bank System Menu ===");
            System.out.println("1. Create / Access Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Show Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    long accNo = sc.nextLong();
                    sc.nextLine(); // consume leftover newline
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();
                    currentAccount = manager.createAccount(accNo, name);
                    break;

                case 2:
                    if (currentAccount == null) {
                        System.out.println("⚠️ Please create or access an account first.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    manager.deposit(currentAccount, depositAmount);
                    break;

                case 3:
                    if (currentAccount == null) {
                        System.out.println("⚠️ Please create or access an account first.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    manager.withdraw(currentAccount, withdrawAmount);
                    break;

                case 4:
                    if (currentAccount == null) {
                        System.out.println("⚠️ Please create or access an account first.");
                        break;
                    }
                    manager.showBalance(currentAccount);
                    break;

                case 5:
                    if (currentAccount == null) {
                        System.out.println("⚠️ Please create or access an account first.");
                        break;
                    }
                    manager.showTransactionHistory(currentAccount);
                    break;

                case 6:
                    System.out.println("👋 Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}