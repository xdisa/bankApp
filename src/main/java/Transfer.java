import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Transfer {
    private int numberOfTransfer;
    private int amount;
    private Currencies name;
    private String date;
    private Person recipient;
    private Person sender;

    public static int counter;

    public Transfer(int numberOfTransfer, int amount, Currencies name, String date, Recipient recipient, Sender sender) {
        this.numberOfTransfer = numberOfTransfer;
        this.amount = amount;
        this.name = name;
        this.date = date;
        this.recipient = recipient;
        this.sender = sender;
    }

    public static Transfer get(Scanner scanner){
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = null;

    dateFormat = new SimpleDateFormat();

        Transfer obj = new Transfer(0,0,Currencies.RUB,"", new Recipient("","","","","",0.0d), new Sender("","","","","",0.0d));
        System.out.println("enter info Recipient ");
        obj.recipient =  Recipient.get(scanner);
        System.out.println("enter info Sender ");
        obj.sender =  Sender.get(scanner);
        obj.numberOfTransfer = Transfer.counter;
        System.out.println("transaction number :"+ obj.numberOfTransfer);
        Transfer.counter++;





    System.out.println("enter currencies (1)-RUB (2)-USD (3)-EUR:");

    while (true) {
        int value = scanner.nextInt();
        if(value == 1){
            obj.name = Currencies.RUB;
            break;
        } if (value ==2){
            obj.name = Currencies.USD;
            break;
        } if (value==3){
            obj.name = Currencies.EUR;
            break;
        }
        System.out.println("enter notCorrected value! pls try again...");

    }
    System.out.println("enter amount :");
        obj.amount = scanner.nextInt();


        switch (obj.name){
            case RUB -> {
                if(obj.getSender().getCashValue() >= obj.amount) {
                    int buff = (int) obj.getSender().getCashValue();
                    buff -= obj.amount;
                    obj.getSender().setCashValue(buff);
                    int buff1 = (int) obj.getRecipient().getCashValue();
                    obj.getRecipient().setCashValue(buff1+obj.amount);
                } else {
                    System.out.println("no money!");
                }
            }
            case EUR -> {
                if(obj.getSender().getCashValue()/90 >= obj.amount) {
                    int buff = (int) obj.getSender().getCashValue()/90;
                    buff -= obj.amount;
                    obj.getSender().setCashValue(buff);
                    int buff1 = (int) obj.getRecipient().getCashValue();
                    obj.getRecipient().setCashValue(buff1+obj.amount);
                } else {
                    System.out.println("no money!");

                }
            }
            case USD -> {
                if(obj.getSender().getCashValue()/80 >= obj.amount) {
                    int buff = (int) obj.getSender().getCashValue()/80;
                    buff -= obj.amount;
                    obj.getSender().setCashValue(buff);
                    int buff1 = (int) obj.getRecipient().getCashValue();
                    obj.getRecipient().setCashValue(buff1+obj.amount);
                } else {
                    System.out.println("no money!");
                }
            }

        }

    obj.date = dateFormat.format( currentDate );
    System.out.println("date transaction :"+ obj.date);

        System.out.println("Номер перевода :"
            + " " +obj.numberOfTransfer + " "
            + "Дата:" + " " + obj.date + " "
            +"номер счета получателя:" + " " +
            obj.getRecipient().getAccNumber()
            + " " + "валюта:" + obj.name + " " + "сумма:"+
            obj.amount + " " +
            " Получатель: " + " "
            +obj.getRecipient().getInfo() + " "
            + "Отправитель: "+ " "
            + obj.getSender().getInfo());


    return obj;

}






////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public int getNumberOfTransfer() {
        return numberOfTransfer;
    }

    public void setNumberOfTransfer(int numberOfTransfer) {
        this.numberOfTransfer = numberOfTransfer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currencies getName() {
        return name;
    }

    public void setName(Currencies name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer transfer = (Transfer) o;
        return numberOfTransfer == transfer.numberOfTransfer && amount == transfer.amount && counter == transfer.counter && name == transfer.name && date.equals(transfer.date) && recipient.equals(transfer.recipient) && sender.equals(transfer.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTransfer, amount, name, date, recipient, sender, counter);
    }

    @Override
    public String toString() {
        return
            "number_of_transfer=" + numberOfTransfer + ", date='" + date + '\'' +
            ", amount=" + amount +
            ", name=" + name +

            ", recipient=" + recipient +
            ", sender=" + sender +
            ", counter=" + counter ;
    }
}
