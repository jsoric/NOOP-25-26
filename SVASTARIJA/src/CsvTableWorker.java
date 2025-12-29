import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvTableWorker {

    public static DefaultTableModel loadCSV(String filePath, JFrame parent) {
        DefaultTableModel model = new DefaultTableModel();

        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (firstLine) {
                    // first line is header
                    model.setColumnIdentifiers(parts);
                    firstLine = false;
                } else {
                    model.addRow(parts);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent, "Error reading file: " + e.getMessage());
        }

        return model;
    }
}
