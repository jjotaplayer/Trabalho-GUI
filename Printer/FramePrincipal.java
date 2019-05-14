package Printer;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class FramePrincipal extends JFrame 
{ 
   private GridBagLayout layout; // layout of this frame
   private GridBagConstraints constraints; // constraints of this layout
   private JButton botao1 = new JButton("    OK    ");
   private JButton botao2 = new JButton("Cancel ");
   private JButton botao3 = new JButton("Setup...");
   private JButton botao4 = new JButton("   Help   ");
   private String[] opcoes = {"High", "Medium", "Low"};
   private JComboBox comboBox = new JComboBox();
   private JRadioButton radioButton1 = new JRadioButton("Selection");
   private JRadioButton radioButton2 = new JRadioButton("All             ");
   private JRadioButton radioButton3 = new JRadioButton("Applet      ");
   private JCheckBox checkBox1 = new JCheckBox("Image");
   private JCheckBox checkBox2 = new JCheckBox("Text   ");
   private JCheckBox checkBox3 = new JCheckBox("Code  ");
   private JCheckBox checkBox4 = new JCheckBox("Print to file");
   private JTextArea texto1 = new JTextArea(5,10);
   private JTextArea texto2 = new JTextArea(5,5);
   private JTextArea texto3 = new JTextArea(5,10);
   private JLabel area1 = new JLabel("Printer: My Printer");
   private JLabel area2 = new JLabel("Print Quality");
   private JLabel espacamento1 = new JLabel("         ");
   
   
    
   // set up GUI
   public FramePrincipal()
   {
      super( "MainFrame" );
      layout = new GridBagLayout();
      setLayout( layout ); 
      constraints = new GridBagConstraints();
      comboBox.setMaximumRowCount(3);
      comboBox = new JComboBox(opcoes);
      addComponent(area1,1,1,5,5);
      addComponent(texto1,8,1,5,10);
      addComponent(checkBox1,8,9,3,3);
      addComponent(checkBox2,11,9,3,3);
      addComponent(checkBox3,15,9,3,3);
      addComponent(texto2,8,13,5,10);
      addComponent(radioButton1,8,23,3,3);
      addComponent(radioButton2,11,23,3,3);
      addComponent(radioButton3,15,23,3,3);
      addComponent(texto3,8,26,5,10);
      addComponent(botao1,1,41,5,5);
      addComponent(botao2,7,41,5,5);
      addComponent(botao3,13,41,5,5);
      addComponent(botao4,20,41,5,5);
      addComponent(area2,20,1,5,5);
      addComponent(comboBox,23,13,5,5);
      addComponent(checkBox4,23,26,5,5);
      
      
      
       // instantiate constraints
      
      
      
      
      
   }
   private void addComponent( Component component,
		      int row, int column, int width, int height )
		   {
		      constraints.gridx = column; // set gridx
		      constraints.gridy = row; // set gridy
		      constraints.gridwidth = width; // set gridwidth
		      constraints.gridheight = height; // set gridheight
		      layout.setConstraints( component, constraints ); // set constraints
		      add( component ); // add component
		   }
}
