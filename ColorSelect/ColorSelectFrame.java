package ColorSelect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ColorSelectFrame extends JFrame 
{ 
   private BorderLayout layout; 
   private TopPanel olokinho;
   private LeftPanel olokao;
   private PaintPanel olokasso;
   private Color[] cores;
   public ColorSelectFrame()
   {
      super( "ColorSelect" );
      
      layout = new BorderLayout(5, 5);
      setLayout( layout ); 
      olokasso = new PaintPanel();
      olokasso.setBackground(Color.WHITE);
      add (olokasso, layout.CENTER);
      olokinho = new TopPanel(olokasso);
      olokinho.setBackground(Color.GRAY);
      add (olokinho, layout.NORTH);
      olokao = new LeftPanel();
      olokao.setBackground(Color.GRAY);
      add (olokao, layout.WEST);
           
     
   } 
}
