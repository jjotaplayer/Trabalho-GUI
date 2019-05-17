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
        private int[] numero = new int[8];
        // Iterador do array numero
        private int i = 0;
        // String usada para printar no textPanel
        private String str = "";
        // Um resultado parcial para cada 2 numero, só para garantir
        private int resultado;
        private Calculo calculador = new Calculo();
        private String operacao;

            public void actionPerformed(ActionEvent event) {

            // Botao Clear
            if(event.getSource() == button[23]) {
                str = "";
                i = 0;
                for(int i = 0; i < numero.length; i++) {
                    numero[i] = 0;
                }
            }
            // Botoes dos numeros
            if (event.getSource() == button[24]) {
                str = str + "0";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "0";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[17]) {
                str = str + "1";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "1";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[18]) {
                str = str + "2";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "2";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[19]) {
                str = str + "3";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "3";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[10]) {
                str = str + "4";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "4";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[11]) {
                str = str + "5";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "5";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[12]) {
                str = str + "6";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "6";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[3]) {
                str = str + "7";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "7";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[4]) {
                str = str + "8";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "8";
                numero[i] = Integer.parseInt(Snumero);
            }
            if (event.getSource() == button[5]) {
                str = str + "9";
                String Snumero = String.valueOf(numero[i]);
                Snumero = Snumero + "9";
                numero[i] = Integer.parseInt(Snumero);
            }

            // Botoes de operacoes basicas
            // cada evento destes botoes aumenta 1 ao iterador, fazendo a separacao dos numeros no array
            if (event.getSource() == button[13]) { // Botao de multiplicacao
                str = str + " " + "*" + " ";
                i = i + 1;
                operacao = "mult";
            }
            if (event.getSource() == button[6]) { // Botao de divisao
                str = str + " " + "/" + " ";
                i = i + 1;
                operacao = "div";
            }
            if (event.getSource() == button[20]) { // Botao de subtracao
                str = str + " " + "-" + " ";
                i = i + 1;
                operacao = "sub";
            }
            if (event.getSource() == button[27]) { // Botao de adicao
                str = str + " " + "+" + " ";
                i = i + 1;
                operacao = "add";
            }

            // Botao igual realiza as operações na classe Calculo.java
            if (event.getSource() == button[26]) {
                if (operacao == "mult") {
                    resultado = calculador.multiplicacao(numero[0], numero[1]);
                }
                if(operacao == "div") {
                    resultado = calculador.divisao(numero[0], numero[1]);
                }
                if(operacao == "sub") {
                    resultado = calculador.subtracao(numero[0], numero[1]);
                }
                if(operacao == "add") {
                    resultado = calculador.adicao(numero[0], numero[1]);
                }
                 // Zerando os numeros 
                for (int i = 0; i < numero.length; i++) {
                    numero[i] = 0;
                }
                str = String.valueOf(resultado);
            }
            // Associacao da variavel string temporaria ao textPanel
            textPanel.setText(str);
        }
    }
}