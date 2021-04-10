import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaExample {
	public static void main(String[] args) {
		JTextAreaElement tae = new JTextAreaElement();
	}
}

class JTextAreaElement extends JFrame {
	JTextArea ta;

	public JTextAreaElement() {
		ta = new JTextArea("Welcome to Javapoint");
		ta.setBounds(50, 50, 250, 230);

		add(ta);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
}
