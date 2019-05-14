import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Printer extends JFrame {
    private JButton[] button;
    private JLabel label1;
    private JLabel label2;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JRadioButton[] rButton;
    private JComboBox comboBox;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panelCheckBox;
    private JPanel panelRadioButton;
    private JPanel panel3;
    private JPanel panel4;
    private JCheckBox[] checkBox;
    private String[] buttonName = {"OK", "Cancel", "Setup..."};
    private String[] rButtonName = {"Selection", "All", "Applet"};
    private String[] checkBoxName = {"Image", "Text", "Code", "Print to File"};
    private String[] comboBoxName = {"Low", "Medium", "High"};
    private ButtonGroup groupRadio;
    private ButtonGroup groupCheck;

    public Printer() {
        super("Printer");
        setLayout(new BorderLayout());
        
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(1, 5));
        panel3.setLayout(new GridLayout(5, 1));
        panel4.setLayout(new FlowLayout());
        panelCheckBox.setLayout(new GridLayout(1, 3));
        panelRadioButton.setLayout(new GridLayout(1, 3));
        add(panel3, BorderLayout.EAST);
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel4, BorderLayout.SOUTH);


        label1 = new JLabel("Printer: My Printer");
        panel1.add(label1);

        textArea1 = new JTextArea(5,10);
        textArea2 = new JTextArea(5,10);
        textArea3 = new JTextArea(5,10);
        
        groupCheck = new ButtonGroup();
        checkBox = new JCheckBox[4];
        for(int i = 0; i < checkBoxName.length; i++) {
            checkBox[i] = new JCheckBox(checkBoxName[i]);
            if(i != 4) {
                groupCheck.add(checkBox[i]);
            }
        }
        panelCheckBox.add(checkBox[0]);
        panelCheckBox.add(checkBox[1]);
        panelCheckBox.add(checkBox[2]);

        groupRadio = new ButtonGroup();
        for(int j = 0; j < rButtonName.length; j++) {
            rButton[j] = new JRadioButton(rButtonName[j]);
            groupRadio.add(rButton[j]);
        }
        panelRadioButton.add(rButton[0]);
        panelRadioButton.add(rButton[1]);
        panelRadioButton.add(rButton[2]);

        panel2.add(textArea1);
        panel2.add(panelCheckBox);
        panel2.add(textArea2);
        panel2.add(panelRadioButton);
        panel2.add(textArea3);


        button = new JButton[4];
        rButton = new JRadioButton[3];
        comboBox = new JComboBox<String>(comboBoxName);
        comboBox.setMaximumRowCount(3);
        label1 = new JLabel("Printer: My Printer");
        label2 = new JLabel("Print Quality");
        textArea1 = new JTextArea(5,10);
        textArea2 = new JTextArea(5,10);

    }
}