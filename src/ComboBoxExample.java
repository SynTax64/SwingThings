import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxExample extends JFrame implements ActionListener {
	String country[] = { "Austria", "Slovenia", "Italia", "Switzerland", "Holland", "Slowakia", "Poland", "Germany" };
	JComboBox<String> cb = new JComboBox(country);
	JLabel l;
	JButton b;

	public ComboBoxExample() {
		l = new JLabel();
		b = new JButton("Show");
		setTitle("ComboBox Example");

		add(cb);
		add(b);
		add(l);
		b.addActionListener(this);
		l.setBounds(50, 30, 460, 20);
		cb.setBounds(50, 70, 150, 20);
		b.setBounds(250, 70, 80, 20);
		setSize(500, 200);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectedProgLang = "Selected Programming Language: " + cb.getItemAt(cb.getSelectedIndex());
		l.setText(selectedProgLang);
	}

	public static void main(String[] args) {
		ComboBoxExample cb = new ComboBoxExample();
	}

}
