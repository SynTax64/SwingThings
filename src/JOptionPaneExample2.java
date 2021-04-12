import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExample2 extends JFrame {

	public JOptionPaneExample2() {
		JOptionPane.showMessageDialog(this, "Successfully Updated.", "Alarm", JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		new JOptionPaneExample2();
	}
}
