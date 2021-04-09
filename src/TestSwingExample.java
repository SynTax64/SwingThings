import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSwingExample {

	public static void main(String[] args) {
		FrameExample fe = new FrameExample();
		SecondFrameExample sfe = new SecondFrameExample();

		JFrame f = new JFrame();
		JButton b = new JButton("Click");
		b.setBounds(130, 100, 100, 40);
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}

class FrameExample {

	JFrame f = new JFrame();
	JButton b = new JButton("Click");

	public FrameExample() {

		b.setBounds(130, 100, 100, 40);
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}

class SecondFrameExample extends JFrame {
	JButton b;

	public SecondFrameExample() {
		b = new JButton("Click");
		b.setBounds(130, 100, 100, 40);
		add(b);
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}
}