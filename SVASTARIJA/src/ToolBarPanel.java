import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel implements ActionListener {

    private JButton openButton;
    private JButton saveButton;
    private JButton deleteRowButton;
    private JButton deleteColumnButton;
    private JButton clearTableButton;
    private JButton redoButton;
    private JButton undoButton;

    public ToolBarPanel() {

        // ✅ layout koji radi s BorderLayout
        setLayout(new FlowLayout(FlowLayout.LEFT, 4, 2));
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        openButton = createButton("/icons/openFileIcon.png", "OPEN");
        saveButton = createButton("/icons/saveFileIcon.png", "SAVE");
        deleteRowButton = createButton("/icons/deleteRowIcon.png", "DELETE_ROW");
        deleteColumnButton = createButton("/icons/deleteColumnIcon.png", "DELETE_COLUMN");
        clearTableButton = createButton("/icons/clearTableColumnIcon.png", "CLEAR");
        redoButton = createButton("/icons/redoArrowIcon.png", "REDO");
        undoButton = createButton("/icons/undoArrowIcon.png", "UNDO");

        add(openButton);
        add(saveButton);
        add(deleteRowButton);
        add(deleteColumnButton);
        add(clearTableButton);
        add(redoButton);
        add(undoButton);
    }

    private JButton createButton(String iconPath, String action) {
        JButton btn = new JButton(new ImageIcon(
                getClass().getResource(iconPath)));
        btn.setActionCommand(action);
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + " clicked");
    }
}
