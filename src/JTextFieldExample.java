import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample {
	public static void main(String[] args) {
		JtextFieldImpl jti = new JtextFieldImpl();
	}
}

class JtextFieldImpl extends JFrame {
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JButton b1;
	JButton b2;

	public JtextFieldImpl() {
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField("0");

		b1 = new JButton("+");
		b2 = new JButton("-");

		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(tf3);

		tf1.setBounds(50, 50, 170, 30);
		tf2.setBounds(50, 100, 170, 30);
		tf3.setBounds(50, 150, 170, 30);
		tf3.setEditable(false);

		b1.setBounds(55, 200, 75, 50);
		b2.setBounds(140, 200, 75, 50);

		setSize(300, 350);
		setLayout(null);
		setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int firstValue = Integer.parseInt(tf1.getText());
				int secondValue = Integer.parseInt(tf2.getText());
				int result = firstValue + secondValue;
				tf3.setText((String.valueOf(result)));
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int firstValue = Integer.parseInt(tf1.getText());
				int secondValue = Integer.parseInt(tf2.getText());
				int result = firstValue - secondValue;
				tf3.setText((String.valueOf(result)));
			}
		});
	}
}
