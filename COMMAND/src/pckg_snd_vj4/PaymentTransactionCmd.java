package pckg_snd_vj4;

public interface PaymentTransactionCmd {

    void execute();
    void undo();
    void redo();

}
