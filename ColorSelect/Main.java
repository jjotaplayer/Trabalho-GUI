package ColorSelect;

import java.awt.Color;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		ColorSelectFrame frame = new ColorSelectFrame(); 
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.setSize(400, 200);
	      frame.getContentPane().setBackground(Color.GRAY);
	      frame.setVisible( true );
	}
}
