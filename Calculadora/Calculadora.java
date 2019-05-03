import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora() {
        super("Calculadora");
        setLayout(new BorderLayout());

        TextPanel text = new TextPanel();
        add(text, BorderLayout.NORTH);

        ButtonPanel buttons = new ButtonPanel();
        add(buttons, BorderLayout.CENTER);

    }

}