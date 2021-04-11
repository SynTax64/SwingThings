import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JTextAreaExample {
	public static void main(String[] args) {
		JTextAreaElement tae = new JTextAreaElement();
	}
}

class JTextAreaElement extends JFrame {
	JTextArea ta;
	JButton b;
	JLabel j1, j2;

	public JTextAreaElement() {
		ta = new JTextArea("Welcome to Javapoint. This is Swing tutorial");
		b = new JButton("Count words");
		j1 = new JLabel();
		j2 = new JLabel();

		ta.setBounds(70, 80, 250, 230);
		j1.setBounds(85, 50, 100, 20);
		j2.setBounds(200, 50, 120, 20);
		b.setBounds(120, 330, 150, 40);

		add(ta);
		add(j1);
		add(j2);
		add(b);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String getTextString = ta.getText();
				String[] arrayOfStrings = getTextString.split("[\\u0020]");
				j1.setText("Words: " + arrayOfStrings.length);
				int cChars = 0;
				for (int i = 0; i < arrayOfStrings.length; i++) {
					cChars += arrayOfStrings[i].length();
				}
				System.out.println(Arrays.toString(arrayOfStrings));
				j2.setText("Charackters: " + cChars);
			}
		});

		setSize(400, 440);
		setResizable(false);
		setLayout(null);
		setVisible(true);

	}
}
