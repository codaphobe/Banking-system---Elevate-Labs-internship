import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private double amt;
    private String transactionType;
    private String timeStamp;

    public Transaction(double amt, String transactionType) {
        this.amt = amt;
        this.transactionType = transactionType;
        this.timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss dd:MM:yyyy"));
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "[" + timeStamp + "] " + transactionType + ": ₹" + amt;
    }
}
