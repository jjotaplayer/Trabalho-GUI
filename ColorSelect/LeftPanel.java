package ColorSelect;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	private JComboBox cor;
	private JButton ok;
	private JButton cancel;
	
	public LeftPanel() {
		String[] cores = { "Azul", "Vermelho", "Verde" };
		setLayout(new GridLayout(3,1,15,7));
		cor = new JComboBox(cores);
		add(cor);
		ok = new JButton("OK");
		add(ok);
		cancel = new JButton("CANCEL");
		add(cancel);
		
		
	}
}
