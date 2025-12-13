package abs_factory;

public class MACGUIFactory implements GUIFactory {

    @Override
    public void renderGUIApp() {
        MACButton macButton = new MACButton();
        macButton.renderButton();
        MACComboBox macComboBox = new MACComboBox();
        macComboBox.renderComboBox();
        MACCheckBox macCheckBox = new MACCheckBox();
        macCheckBox.renderCheckBox();
        MACList macList = new MACList();
        macList.renderList();
    }

    @Override
    public String toString() {
        return "MACGUIFactory{Rendering all for MAC GUI!! : }";
    }
}
