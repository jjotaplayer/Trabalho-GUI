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
        // Atribuição do Listener para cada botão
        for (int i = 0; i < names.length; i++) {
            button[i].addActionListener(listener);
        }
    }

    private class Listener implements ActionListener {
        // Armazena os numeros para user no calculo
        private String[] numero = new String[8];
        // Iterador do array numero
        private int i = 0;
        // String usada para printar no textPanel
        private String str = "";

        public void actionPerformed(ActionEvent event) {

            // Botoes dos numeros
            if (event.getSource() == button[24]) {
                str = str + "0";
                numero[i] = numero[i] + "0";
            }
            if (event.getSource() == button[17]) {
                str = str + "1";
                numero[i] = numero[i] + "1";
            }
            if (event.getSource() == button[18]) {
                str = str + "2";
                numero[i] = numero[i] + "2";
            }
            if (event.getSource() == button[19]) {
                str = str + "3";
                numero[i] = numero[i] + "3";
            }
            if (event.getSource() == button[10]) {
                str = str + "4";
                numero[i] = numero[i] + "4";
            }
            if (event.getSource() == button[11]) {
                str = str + "5";
                numero[i] = numero[i] + "5";
            }
            if (event.getSource() == button[12]) {
                str = str + "6";
                numero[i] = numero[i] + "6";
            }
            if (event.getSource() == button[3]) {
                str = str + "7";
                numero[i] = numero[i] + "7";
            }
            if (event.getSource() == button[4]) {
                str = str + "8";
                numero[i] = numero[i] + "8";
            }
            if (event.getSource() == button[5]) {
                str = str + "9";
                numero[i] = numero[i] + "9";
            }

            // Botoes de operacoes basicas
            // cada evento destes botoes aumenta 1 ao iterador, fazendo a separacao dos numeros no array
            if (event.getSource() == button[13]) { // Botao de multiplicacao
                str = str + " " + "*" + " ";
                i = i + 1;
            }
            if (event.getSource() == button[6]) { // Botao de divisao
                str = str + " " + "/" + " ";
                i = i + 1;
            }
            if (event.getSource() == button[20]) { // Botao de subtracao
                str = str + " " + "-" + " ";
                i = i + 1;
            }
            if (event.getSource() == button[27]) { // Botao de adicao
                str = str + " " + "+" + " ";
                i = i + 1;
            }
            // Associacao da variavel string temporaria ao textPanel
            textPanel.textArea.setText(str);
        }
    }
}