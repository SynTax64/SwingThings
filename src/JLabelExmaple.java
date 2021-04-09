import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//
//public class JLabelExmaple {
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		JLabel l1, l2;
//
//		l1 = new JLabel("First label");
//		l2 = new JLabel("Second label");
//
//		l1.setBounds(100, 50, 100, 30);
//		l2.setBounds(100, 100, 100, 30);
//
//		f.add(l1);
//		f.add(l2);
//
//		f.setSize(300, 200);
//		f.setLayout(null);
//		f.setVisible(true);
//	}
//}

class JLabelExmaple extends Frame {
	JTextField tf;
	JLabel l;
	JButton b;

	JLabelExmaple() {
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		add(b);
		add(tf);
		add(l);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String host = tf.getText();
					String ip = java.net.InetAddress.getByName(host).getHostAddress();
					l.setText("IP of " + host + " is: " + ip);
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});

	}

	public static void main(String[] args) {
		JLabelExmaple le = new JLabelExmaple();
	}
}
