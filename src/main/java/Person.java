import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String cardNumber;
    private String accNumber;
    private double cashValue;


    public Person(String lastName, String firstName, String patronymic, String cardNumber, String accNumber, double cashValue) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.cardNumber = cardNumber;
        this.accNumber = accNumber;
        this.cashValue = cashValue;
    }

    public static Person get(Scanner scanner){
        Person obj = new Person("","","","","",0.0d);
        obj.lastName = scanner.nextLine();
        System.out.println("enter lastName :");
        obj.lastName = scanner.nextLine();
        System.out.println("enter firstName :");
        obj.firstName = scanner.nextLine();
        System.out.println("enter fatherName :");
        obj.patronymic = scanner.nextLine();
        System.out.println("enter card num :");
        obj.cardNumber = scanner.nextLine();
        System.out.println("enter acc num :");
        obj.accNumber = scanner.nextLine();
        System.out.println("enter cash value:");
        obj.cashValue = scanner.nextDouble();

        return obj;
    }

    public String getInfo(){
        return this.firstName + " " + this.lastName + " " + this.patronymic;
    }

    public String getFullNameUpperCase(){
        return getInfo().toUpperCase();
    }

    public String getFullNameLowerCase(){
        return  getInfo().toLowerCase();
    }

    public void add_cash(double value){
        cashValue +=value;
    }

////////////////////////////////////////////////////////////////////////
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String fatherName) {
        this.patronymic = patronymic;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    @Override
    public String toString() {
        return "Person{" +
            "lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", patronymic='" + patronymic + '\'' +
            ", cardNumber='" + cardNumber + '\'' +
            ", accNumber='" + accNumber + '\'' +
            ", cashValue='" + cashValue + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(firstName, person.firstName) && Objects.equals(patronymic, person.patronymic) && Objects.equals(cardNumber, person.cardNumber) && Objects.equals(accNumber, person.accNumber) && Objects.equals(cashValue, person.cashValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, patronymic, cardNumber, accNumber, cashValue);
    }

}
