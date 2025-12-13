package abs_factory;

public class WINGUIFact implements GUIFactory{
    @Override
    public void renderGUIApp() {
        WINButton but = new WINButton();
        but.renderButton();
        WINList list = new WINList();
        list.renderList();
        WINCheckBox check = new WINCheckBox();
        check.renderCheckBox();
        WINComboBox combo = new WINComboBox();
        combo.renderComboBox();
    }

    @Override
    public String toString() {
        return "WINGUIFact{Creating WIN Fatctory!!! : }";
    }
}
