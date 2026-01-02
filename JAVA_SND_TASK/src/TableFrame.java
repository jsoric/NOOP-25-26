import Commands.ClearTableCommand;
import Commands.DeleteColCommand;
import Commands.DeleteRowCommand;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;

public class TableFrame extends JFrame {

    private JTable table;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;

    private JMenuItem jMenuItemOpenFile;
    private JMenuItem jMenuItemSaveFile;
    private JMenuItem jMenuItemExit;

    private DefaultTableModel model;
    private CommandHandler commandHandler = new CommandHandler();

    public TableFrame() {

        setTitle("Table app");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());



        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        jMenuItemOpenFile = new JMenuItem("Open...");
        jMenuItemSaveFile = new JMenuItem("Save...");
        jMenuItemExit = new JMenuItem("Exit");

        jMenuItemOpenFile.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK)
        );
        jMenuItemSaveFile.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK)
        );
        jMenuItemExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK)
        );

        JMenuItem undoMenuItem = new JMenuItem("Undo");
        JMenuItem redoMenuItem = new JMenuItem("Redo");
        JMenuItem deleteRowMenuItem = new JMenuItem("Delete row");
        JMenuItem deleteColMenuItem = new JMenuItem("Delete column");
        JMenuItem clearTableMenuItem = new JMenuItem("Clear table");

        undoMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK)
        );
        redoMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK)
        );
        deleteRowMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK)
        );
        deleteColMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK)
        );
        clearTableMenuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_DOWN_MASK)
        );

        fileMenu.add(jMenuItemOpenFile);
        fileMenu.add(jMenuItemSaveFile);
        fileMenu.addSeparator();
        fileMenu.add(jMenuItemExit);

        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(deleteRowMenuItem);
        editMenu.add(deleteColMenuItem);
        editMenu.add(clearTableMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);

        model = new DefaultTableModel(
                new Object[][]{
                        {"", "", ""},
                        {"", "", ""},
                        {"", "", ""}
                },
                new String[]{"A", "B", "C"}
        );

        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        table.setCellSelectionEnabled(true);
        table.setRowHeight(20);
        table.getTableHeader().setReorderingAllowed(false);


        scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        add(scrollPane, BorderLayout.CENTER);

        jMenuItemOpenFile.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser(new File("data"));
            int result = chooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                DefaultTableModel loaded = loadCSV(
                        chooser.getSelectedFile().getAbsolutePath()
                );

                model.setRowCount(0);
                model.setColumnCount(0);

                for (int i = 0; i < loaded.getColumnCount(); i++) {
                    model.addColumn(loaded.getColumnName(i));
                }

                for (int r = 0; r < loaded.getRowCount(); r++) {
                    Object[] rowData = new Object[loaded.getColumnCount()];
                    for (int c = 0; c < loaded.getColumnCount(); c++) {
                        rowData[c] = loaded.getValueAt(r, c);
                    }
                    model.addRow(rowData);
                }
            }
        });

        jMenuItemSaveFile.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser(new File("data"));
            int result = chooser.showSaveDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getAbsolutePath();
                saveModel(model, path);
            }
        });

        jMenuItemExit.addActionListener(e -> System.exit(0));

        deleteRowMenuItem.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                commandHandler.execute(
                        new DeleteRowCommand(model, selectedRow)
                );
            }
        });

        deleteColMenuItem.addActionListener(e -> {
            int selectedCol = table.getSelectedColumn();

            if (selectedCol != -1) {
                commandHandler.execute(
                        new DeleteColCommand(model, selectedCol)
                );
            }
        });

        clearTableMenuItem.addActionListener(e -> {
            if (model.getRowCount() > 0) {
                commandHandler.execute(
                        new ClearTableCommand(model)
                );
            }
        });


        undoMenuItem.addActionListener(e -> commandHandler.undo());
        redoMenuItem.addActionListener(e -> commandHandler.redo());

        setVisible(true);
    }

    public DefaultTableModel loadCSV(String filePath) {
        DefaultTableModel tempModel = new DefaultTableModel();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (firstLine) {
                    for (String col : parts) {
                        tempModel.addColumn(col);
                    }
                    firstLine = false;
                } else {
                    tempModel.addRow(parts);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return tempModel;
    }

    private void saveModel(DefaultTableModel model, String filepath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filepath))) {

            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.print(model.getColumnName(i));
                if (i != model.getColumnCount() - 1)
                    writer.print(",");
            }
            writer.println();

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.print(model.getValueAt(i, j));
                    if (j != model.getColumnCount() - 1)
                        writer.print(",");
                }
                writer.println();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Failed to save file:\n" + e.getMessage(),
                    "Save error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

}
