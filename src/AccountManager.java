import java.util.ArrayList;

public class AccountManager {

    private final ArrayList<Account> accountsList = new ArrayList<>();

    private boolean checkAccountExists(long accNo){
        return accountsList.stream().anyMatch(acc -> acc.getAccountNo() == accNo);
    }

    public Account createAccount(long accNo, String accHolderName){
        boolean exists = checkAccountExists(accNo);
        if(!exists){
            Account newAcc = new Account(0,accNo,accHolderName);
            accountsList.add(newAcc);
            System.out.println("New account created!!\n"+"Account number: "+accNo+"\n Name: "+accHolderName);
            return newAcc;
        }
        System.out.println("Account fetched successfully");
        return accountsList.stream().filter(acc -> acc.getAccountNo() == accNo).findFirst().orElse(null);
    }

    public void deposit(Account acc, double amt){
        if(amt<=0){
            System.err.println("Please deposit amount greater than 0 rupees");
            return;
        }
        double totalBalance = acc.getBalance() + amt;
        acc.setBalance(totalBalance);
        acc.getTransactionHistory().add(new Transaction(amt,"Credited"));
        System.out.println("Deposited amount : ₹ "+amt+" successfully. New Balance: ₹ "+acc.getBalance());
    }

    public void withdraw(Account acc, double amt){
        if(acc.getBalance() < amt){
            System.err.println("Insufficient Balance ⚠️");
            return;
        }
        double newBalance = acc.getBalance() - amt;
        acc.setBalance(newBalance);
        acc.getTransactionHistory().add(new Transaction(amt,"Debited"));
        System.out.println("Withdraw of amt : ₹ "+amt+" successful. New Balance: ₹ "+acc.getBalance());
    }

    public void showBalance(Account acc){
        System.out.println("Current balance: ₹ "+ acc.getBalance());
    }

    public void showTransactionHistory(Account acc){
        System.out.println("Transaction history of Account no."+acc.getAccountNo());
        acc.getTransactionHistory().forEach(System.out::println);
    }
}
