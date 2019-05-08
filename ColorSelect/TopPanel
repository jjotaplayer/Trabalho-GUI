package ColorSelect;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	
	private JButton aumenta;
	private JButton diminui;
	private JButton clear;
	
	public TopPanel(PaintPanel olokasso) {
		GeneralListener alo = new GeneralListener(olokasso);
		setLayout(new GridLayout(1,3,7,15));
		aumenta = new JButton("+");
		aumenta.addActionListener(alo);
		add(aumenta);
		diminui = new JButton("-");
		diminui.addActionListener(alo);
		add(diminui);
		clear = new JButton("Clear");
		clear.addActionListener(alo);
		add(clear);
		
	}
		 class GeneralListener implements ActionListener{
			protected PaintPanel olokasso;
		    public GeneralListener(PaintPanel olokasso) {
		    	this.olokasso = olokasso;
		    	
		    }
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == clear) {
						olokasso.clear();
						olokasso.repaint();
					}
					if (e.getSource()== diminui) {
						olokasso.changeAm();
						olokasso.repaint();
					}
					if (e.getSource()== aumenta) {
						olokasso.changeAp();
						olokasso.repaint();
					}
				}
			}
	}
 
