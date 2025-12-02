package pckg_snd_vj4;

import java.util.Stack;

public class MobAccApp {

    private PaymentTransactionCmd paymentTransactionCmd;
    private Stack<PaymentTransactionCmd> undoStack;
    private Stack<PaymentTransactionCmd> redoStack;

    public MobAccApp() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setPaymentTransactionCmd(PaymentTransactionCmd paymentTransactionCmd) {
        this.paymentTransactionCmd = paymentTransactionCmd;
    }

    public void performTransaction() {
        paymentTransactionCmd.execute();
        undoStack.add(paymentTransactionCmd);
    }

    public void undoLastTransaction() {
        if(undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            paymentTransactionCmd = undoStack.pop();
            paymentTransactionCmd.undo();
            redoStack.add(paymentTransactionCmd);
        }
    }

    public void redoLastTransaction() {
        if(redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
        } else {
            paymentTransactionCmd = redoStack.pop();
            paymentTransactionCmd.redo();
            undoStack.add(paymentTransactionCmd);
        }
    }
}
