import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ButtonPanel extends JPanel {
    private JButton[] buttons;
    private final String[] names = {"x!", "e^x", "raiz 2", "7", "8", "9", "/", "x³", "x²", "raiz 3", "4", "5", "6", "*", "c1", "%", "x^y", "1", "2", "3", "-", "d1", "d2", "d3", "0", ".", "=", "+"};

    public ButtonPanel() {
        setLayout(new GridLayout(4, 7, 5, 10));

        buttons = new JButton[names.length];
        for(int i = 0; i < names.length; i++) {
            buttons[i] = new JButton(names[i]);
            add(buttons[i]);
        }

    }
}