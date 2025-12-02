package pckg_snd_vj4;

public class Client {

    public static void main(String[] args) {
        CheckingAccount lucijan =  new CheckingAccount("Lucijan");
        MobAccApp mobAccApp = new MobAccApp();
        DepositMoneyTransaction depositMoneyTransaction =  new DepositMoneyTransaction(lucijan, 1300);
        System.out.println(lucijan);
        mobAccApp.setPaymentTransactionCmd(depositMoneyTransaction);
        mobAccApp.performTransaction();
        System.out.println(lucijan);
        mobAccApp.undoLastTransaction();
        System.out.println(lucijan);
    }
}
