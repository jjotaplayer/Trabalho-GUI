import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Printer extends JFrame {
    private JButton[] button;
    private JLabel label1;
    private JLabel label2;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JRadioButton[] rButton;
    private JComboBox comboBox;
    private JCheckBox[] checkBox;
    private String[] buttonName = {"OK", "Cancel", "Setup..."};
    private String[] rButtonName = {"Selection", "All", "Applet"};
    private String[] checkBoxName = {"Image", "Text", "Code", "Print to File"};
    private String[] comboBoxName = {"Low", "Medium", "High"};

    public Printer() {
        super("Printer");

        button = new JButton[4];
        rButton = new JRadioButton[3];
        checkBox = new JCheckBox[4];
        comboBox = new JComboBox<String>(comboBoxName);
        comboBox.setMaximumRowCount(3);
        label1 = new JLabel("Printer: My Printer");
        label2 = new JLabel("Print Quality");
        textArea1 = new JTextArea(5,10);
        textArea2 = new JTextArea(5,10);

    }
}