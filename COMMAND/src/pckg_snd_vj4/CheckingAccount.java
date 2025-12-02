package pckg_snd_vj4;

public class CheckingAccount extends Account{

    public CheckingAccount(String name) {
        super(name);
    }

    @Override
    public void depositMoney(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + name);
    }

    @Override
    public double withdrawMoney(double amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient funds! Balance: " + balance);
            return 0;
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + name + ".  Balance: " + balance);
            return amount;
        }
    }
}
