package pckg_snd_vj4;

public class DepositMoneyTransaction implements PaymentTransactionCmd {

    private Account account;
    private double amount;

    public DepositMoneyTransaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.depositMoney(amount);
    }

    @Override
    public void undo() {
        account.withdrawMoney(amount);
    }

    @Override
    public void redo() {
        execute();
    }
}
