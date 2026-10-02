package FRQ1;

public class BankAccountTester {
    public static void main(String[] args) {

    BankAccount alex = new BankAccount("Alex", 100.0);
    BankAccount jamie = new BankAccount("Jamie", 250.0);

    alex.deposit(50.0);

    alex.printInfo();
    jamie.printInfo();

    }
}