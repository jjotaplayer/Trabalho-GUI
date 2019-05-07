import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora() {
        super("Calculadora");

        TextPanel text = new TextPanel();
        add(text, BorderLayout.NORTH);

        ButtonPanel buttons = new ButtonPanel(text);
        add(buttons, BorderLayout.CENTER);
    }
}