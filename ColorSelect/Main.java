package ColorSelect;

import java.awt.Color;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		ColorSelectFrame frame = new ColorSelectFrame(); 
	      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      frame.getContentPane().setBackground( Color.GRAY );
	      frame.setSize( 500, 300 ); // set frame size
	      frame.setVisible( true );
	      


	}

}
