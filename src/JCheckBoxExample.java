import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxExample extends JFrame {

	public JCheckBoxExample() {
		JCheckBox cb1 = new JCheckBox("C++");
		JCheckBox cb2 = new JCheckBox("Java");
		JLabel l = new JLabel();

		cb1.setBounds(70, 50, 100, 50);
		cb2.setBounds(70, 100, 100, 50);
		l.setBounds(70, 20, 200, 20);

		add(cb1);
		add(cb2);
		add(l);

		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				l.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				l.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
			}
		});

		setLayout(null);
		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		JCheckBoxExample checkBoxExample = new JCheckBoxExample();
	}
}
