import java.util.ArrayList;

public class Account {

    private long accountNo;
    private String holderName;
    private double balance;
    private ArrayList<Transaction> transaction;


    public Account(double initialBalance, long accountNo, String holderName) {
        this.balance = initialBalance;
        this.transaction = new ArrayList<>();
        this.accountNo = accountNo;
        this.holderName = holderName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transaction;
    }

    public void setTransactionHistory(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }
}
