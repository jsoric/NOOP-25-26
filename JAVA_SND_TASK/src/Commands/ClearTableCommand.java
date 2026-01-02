package Commands;
import javax.swing.table.DefaultTableModel;

public class ClearTableCommand implements Command {

    private DefaultTableModel model;
    private Object[][] oldData;

    public ClearTableCommand(DefaultTableModel model) {
        this.model = model;
    }

    @Override
    public void execute() {

        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        oldData = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                oldData[i][j] = model.getValueAt(i, j);
            }
        }

        model.setRowCount(0);
    }

    @Override
    public void undo() {

        if (oldData == null) return;

        for (int i = 0; i < oldData.length; i++) {
            model.addRow(oldData[i]);
        }
    }
}
