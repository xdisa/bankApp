import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TransferAccToAcc extends Transfer {


    public TransferAccToAcc(int number_of_transfer, int amount, Currencies name, String date, Recipient recipient, Sender sender) {
        super(number_of_transfer, amount, name, date, recipient, sender);
    }



    ///////////////////////////////////////////////////////////////////////


    @Override
    public int getNumberOfTransfer() {
        return super.getNumberOfTransfer();
    }

    @Override
    public void setNumberOfTransfer(int numberOfTransfer) {
        super.setNumberOfTransfer(numberOfTransfer);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public Currencies getName() {
        return super.getName();
    }

    @Override
    public void setName(Currencies name) {
        super.setName(name);
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public void setDate(String date) {
        super.setDate(date);
    }

    @Override
    public Person getRecipient() {
        return super.getRecipient();
    }

    @Override
    public void setRecipient(Recipient recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public Person getSender() {
        return super.getSender();
    }

    @Override
    public void setSender(Sender sender) {
        super.setSender(sender);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
