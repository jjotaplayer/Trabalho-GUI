package ColorSelect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;

public class ColorSelectFrame extends JFrame 
{ 
   private BorderLayout layout; 
   private TopPanel olokinho;
   private LeftPanel olokao;
   private PaintPanel olokasso;
   
   public ColorSelectFrame()
   {
      super( "ColorSelect" );
      
      layout = new BorderLayout(5, 5);
      setLayout( layout ); 
      olokasso = new PaintPanel();
      olokasso.setBackground(Color.WHITE);
      add (olokasso, layout.CENTER);
      olokinho = new TopPanel(olokasso);
      olokinho.setOpaque(false);
  
      add (olokinho, layout.NORTH);
    
      olokao = new LeftPanel(olokasso);
      olokao.setOpaque(false);
      
      add (olokao, layout.WEST);
           
     
   }
   public void trocarBackground(Color cor) {
	  this.setBackground(cor);
	  
   }
   
   
   
   					//CLASSE INTERNA
   
   
   
   public class LeftPanel extends JPanel {
		private JButton cor;
		private JButton ok;
		private JButton cancel;
		private Color color = Color.LIGHT_GRAY;
		private Color finalColor = Color.LIGHT_GRAY;
		private PaintPanel olokasso;
		
		public LeftPanel(PaintPanel olokasso) {
			setLayout(new GridLayout(3,1,15,7));
			this.olokasso = olokasso;
			cor = new JButton("COR");
			cor.addActionListener(
					new ActionListener() { 
						@Override 
						public void actionPerformed(ActionEvent arg0) {
							LeftPanel.this.color = JColorChooser.showDialog(LeftPanel.this, "Escolhe uma cor", color); 
							if (color == null) 
								color = Color.GRAY;
							
							} 
						} 
					);
			
			add(cor);
			
			
			ok = new JButton("OK");
			ok.addActionListener(new GenericActLis());
			add(ok);
			
			cancel = new JButton("CANCEL");
			cancel.addActionListener( 
					new ActionListener() { 
						public void actionPerformed(ActionEvent arg0) {
							finalColor = Color.GRAY;
							color = Color.GRAY;
							LeftPanel.this.trocaBackground(color);
							LeftPanel.this.trocaCorPincel(color);
						} 
					} 
				);
			add(cancel);
			
			}//FIM CONSTRUTOR
		
		
		public void trocaBackground(Color cor) {
			ColorSelectFrame.this.getContentPane().setBackground(cor);
		}
		public void trocaCorPincel(Color pin) {
			this.olokasso.trocaCor(pin);
		}
		
		
		//CLASSE INTERNA DA CLASSE INTERNA 
		
		
		
	class GenericActLis implements ActionListener {

			
			Color a;
			
		public GenericActLis() {
			
		}
		
		public void actionPerformed(ActionEvent arg0) {
				a = LeftPanel.this.color;
				LeftPanel.this.trocaBackground(a);
				LeftPanel.this.trocaCorPincel(a);	
			} 
		}
	}
}
