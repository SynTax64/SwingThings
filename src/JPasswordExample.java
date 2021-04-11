import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPasswordExample {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		JLabel l1 = new JLabel("Username: ");
		JLabel l2 = new JLabel("Password: ");
		JTextField tf = new JTextField();
		JPasswordField p = new JPasswordField();

		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JButton b = new JButton("Login");

		l1.setBounds(50, 50, 130, 30);
		tf.setBounds(150, 50, 150, 30);
		l2.setBounds(50, 100, 130, 30);
		p.setBounds(150, 100, 150, 30);

		l3.setBounds(50, 150, 150, 30);
		l4.setBounds(200, 150, 150, 30);

		b.setBounds(150, 200, 80, 30);
		f.add(l3);
		f.add(l4);
		f.add(l1);
		f.add(l2);
		f.add(tf);
		f.add(p);
		f.add(b);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 500);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String getUsr = tf.getText();
				String getPasswd = "" + new String(p.getPassword());
				l3.setText("Username: " + getUsr);
				l4.setText("Password: " + getPasswd);

				System.out.println("Username " + getUsr);
				System.out.println("Password: " + getPasswd);
			}
		});
	}
}
