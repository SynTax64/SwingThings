import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExample3 extends JFrame {

	public JOptionPaneExample3() {
		JOptionPane.showInputDialog(this, "Enter Name");

	}

	public static void main(String[] args) {
		new JOptionPaneExample3();
	}
}
