package pckg_snd_vj4;

public class ForeignCurrencyAccount extends Account {

    protected ForeignCurrencyAccount(String name) {
        super(name);
    }

    @Override
    public void depositMoney(double amount) {

    }

    @Override
    public double withdrawMoney(double amount) {
        return 0;
    }
}
