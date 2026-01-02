package Commands;
import javax.swing.table.DefaultTableModel;

public class DeleteColCommand implements Command {

    private DefaultTableModel model;
    private int selectedCol;

    private String columnName;
    private Object[] columnData;

    public DeleteColCommand(DefaultTableModel model, int selectedCol) {
        this.model = model;
        this.selectedCol = selectedCol;
    }

    @Override
    public void execute() {

        if (selectedCol < 0 || selectedCol >= model.getColumnCount()) {
            return;
        }

        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        columnName = model.getColumnName(selectedCol);
        columnData = new Object[rowCount];

        for (int i = 0; i < rowCount; i++) {
            columnData[i] = model.getValueAt(i, selectedCol);
        }

        Object[][] newData = new Object[rowCount][colCount - 1];
        String[] newHeaders = new String[colCount - 1];

        for (int i = 0, j = 0; i < colCount; i++) {
            if (i != selectedCol) {
                newHeaders[j++] = model.getColumnName(i);
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0, k = 0; j < colCount; j++) {
                if (j != selectedCol) {
                    newData[i][k++] = model.getValueAt(i, j);
                }
            }
        }

        model.setRowCount(0);
        model.setColumnCount(0);

        for (int i = 0; i < newHeaders.length; i++) {
            model.addColumn(newHeaders[i]);
        }

        for (int i = 0; i < newData.length; i++) {
            model.addRow(newData[i]);
        }
    }

    @Override
    public void undo() {

        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        Object[][] newData = new Object[rowCount][colCount + 1];
        String[] newHeaders = new String[colCount + 1];

        for (int i = 0, j = 0; i < colCount + 1; i++) {
            if (i == selectedCol) {
                newHeaders[i] = columnName;
            } else {
                newHeaders[i] = model.getColumnName(j++);
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0, k = 0; j < colCount + 1; j++) {
                if (j == selectedCol) {
                    newData[i][j] = columnData[i];
                } else {
                    newData[i][j] = model.getValueAt(i, k++);
                }
            }
        }

        model.setRowCount(0);
        model.setColumnCount(0);

        for (int i = 0; i < newHeaders.length; i++) {
            model.addColumn(newHeaders[i]);
        }

        for (int i = 0; i < newData.length; i++) {
            model.addRow(newData[i]);
        }
    }
}
