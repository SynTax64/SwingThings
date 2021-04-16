package Layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame {

	public BorderLayoutExample() {
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("West");
		JButton b4 = new JButton("East");
		JButton b5 = new JButton("Center");

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.WEST);
		add(b4, BorderLayout.EAST);
		add(b5, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}
}
