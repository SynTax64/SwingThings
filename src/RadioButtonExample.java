import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonExample extends JFrame implements ActionListener {

	JRadioButton rb1;
	JRadioButton rb2;
	JLabel l1;
	JLabel l2;
	JButton b;

	public RadioButtonExample() {
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		b = new JButton("Who");

		l1 = new JLabel("A) Male");
		l2 = new JLabel("B) Female");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		add(rb1);
		add(rb2);
		add(l1);
		add(l2);
		add(b);
		b.addActionListener(this);

		rb1.setBounds(30, 40, 20, 20);
		rb2.setBounds(30, 60, 20, 20);
		l1.setBounds(55, 40, 100, 20);
		l2.setBounds(55, 60, 100, 20);
		b.setBounds(60, 90, 60, 30);

		setSize(200, 250);
		setLayout(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuilder out = new StringBuilder();

		if (rb1.isSelected()) {
			out.append("You are Male");

		} else if (rb2.isSelected()) {
			out.append("You are Female");
		}

		JOptionPane.showMessageDialog(this, out);

	}

	public static void main(String[] args) {
		RadioButtonExample rb = new RadioButtonExample();
	}
}
