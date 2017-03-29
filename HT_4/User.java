package HT_4;

public class User {

    public double id;
    public double balance;
    public int monthsOfEmployment;
    public String companyName;
    public int salary;
    public Bank bank;

    public User(double id, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
