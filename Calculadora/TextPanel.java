import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {
    protected JTextField textArea;
    
    public TextPanel() {
        setLayout(new FlowLayout());
        textArea = new JTextField(35);
        add(textArea);

    }
    public void setText(String str) {
    	this.textArea.setText(str);
    }
}