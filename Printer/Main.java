import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        printer.setSize(450, 250);
        printer.setVisible(true);
    }
}