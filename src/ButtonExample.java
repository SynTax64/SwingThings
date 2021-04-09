import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("JButton Example");
		JButton b = new JButton(new ImageIcon("button.png"));
		JTextField tf = new JTextField("empty");

		b.setBounds(200, 200, 120, 31);
		tf.setBounds(100, 50, 200, 20);

		f.add(tf);
		f.add(b);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("clicked");
			}
		});

		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);

	}
}
