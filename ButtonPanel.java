import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private TextPanel textPanel;
    private JButton[] button;
    private final String[] names = { "x!", "e^x", "raiz 2", "7", "8", "9", "/", "x³", "x²", "raiz 3", "4", "5", "6",
            "*", "pi", "%", "x^y", "1", "2", "3", "-", "(", ")", "Clear", "0", ".", "=", "+" };

    public ButtonPanel(TextPanel textPanel) {
        setLayout(new GridLayout(4, 7, 5, 10));
        this.textPanel = textPanel;

        button = new JButton[names.length];
        for (int i = 0; i < names.length; i++) {
            button[i] = new JButton(names[i]);
            add(button[i]);
        }
        
        //Criação do listener 
        Listener listener = new Listener();
        button[3].addActionListener(listener);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == button[3]) {
               textPanel.textArea.setText(button[3].getText()) ; 
            }
        }
    }
}
