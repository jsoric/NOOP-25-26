import commands.CommandPatternHandler;
import commands.DeleteRowCommand;
import commands.RedoCommand;
import commands.UndoCommand;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class TableFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;

    private JMenuItem jMenuItemOpenFile;
    private JMenuItem jMenuItemSaveFile;
    private JMenuItem jMenuItemExit;

    private ToolBarPanel toolBarPanel;

    private JTable table;
    private JScrollPane scrollPane;

    private CommandPatternHandler commandPatternHandler = new CommandPatternHandler();

    public TableFrame() {

        /* ================= FRAME ================= */

        setTitle("Table app");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new BorderLayout());

        /* ================= MENU BAR ================= */

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        jMenuItemOpenFile = new JMenuItem("Open...");
        jMenuItemSaveFile = new JMenuItem("Save...");
        jMenuItemExit = new JMenuItem("Exit");

        JMenuItem deleteRowMenuItem = new JMenuItem("Delete Row");
        JMenuItem undoMenuItem = new JMenuItem("Undo");
        JMenuItem redoMenuItem = new JMenuItem("Redo");

        jMenuItemOpenFile.setMnemonic(KeyEvent.VK_O);
        jMenuItemSaveFile.setMnemonic(KeyEvent.VK_S);
        jMenuItemExit.setMnemonic(KeyEvent.VK_X);

        jMenuItemOpenFile.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK)
        );
        jMenuItemSaveFile.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK)
        );
        jMenuItemExit.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK)
        );

        // ✅ SVI ACTION LISTENERI (KAKO SI IMAO)
        jMenuItemOpenFile.addActionListener(e ->
                System.out.println("Open file!")
        );

        jMenuItemSaveFile.addActionListener(e ->
                System.out.println("Save file!")
        );

        jMenuItemExit.addActionListener(e ->
                System.exit(0)
        );

        fileMenu.add(jMenuItemOpenFile);
        fileMenu.add(jMenuItemSaveFile);
        fileMenu.addSeparator();
        fileMenu.add(jMenuItemExit);

        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(deleteRowMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        /* ================= TOOLBAR ================= */
        toolBarPanel = new ToolBarPanel();
        add(toolBarPanel, BorderLayout.NORTH);

        /* ================= TABLE ================= */

        //String csvPath = "E://Github_NOOP_25-26//NOOP-25-26//SVASTARIJA//src//data/housing.csv";
        DefaultTableModel model = new DefaultTableModel();

        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setRowHeight(20);

        scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        );

        add(scrollPane, BorderLayout.CENTER);

        jMenuItemOpenFile.addActionListener(e -> openCsv());


        deleteRowMenuItem.addActionListener(a -> {
            commandPatternHandler.execute(new DeleteRowCommand(model, table.getSelectedRow()));
        });

        undoMenuItem.addActionListener(e ->
                commandPatternHandler.execute(
                        new UndoCommand(commandPatternHandler)
                )
        );

        redoMenuItem.addActionListener(e ->
                commandPatternHandler.execute(
                        new RedoCommand(commandPatternHandler)
                )
        );


        setVisible(true);
    }

    private void openCsv() {

        JFileChooser chooser = new JFileChooser(); // opens Documents by default

        chooser.setFileFilter(
                new FileNameExtensionFilter("CSV Files (*.csv)", "csv")
        );

        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            DefaultTableModel model =
                    CsvTableWorker.loadCSV(file.getAbsolutePath(), this);

            table.setModel(model);
        }
    }



}
