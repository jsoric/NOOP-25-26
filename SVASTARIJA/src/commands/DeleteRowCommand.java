package commands;

import javax.swing.table.DefaultTableModel;

public class DeleteRowCommand implements Command{

    private DefaultTableModel model;
    private int selectedRow = 0;
    private Object[] rowData;

    public DeleteRowCommand(DefaultTableModel model, int selectedRow){
        this.model = model;
        this.selectedRow = selectedRow;
    }

    @Override
    public void execute() {

        rowData = new Object[model.getColumnCount()];
        for(int i = 0; i < model.getColumnCount(); i++){
            rowData[i] = model.getValueAt(selectedRow, i);
        }

        model.removeRow(selectedRow);
    }

    @Override
    public void undo() {
        model.insertRow(selectedRow, rowData);
    }
}
