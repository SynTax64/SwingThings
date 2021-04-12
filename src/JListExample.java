import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListExample extends JFrame {
	public JListExample() {
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Item1");
		listModel.addElement("Item2");
		listModel.addElement("Item3");
		listModel.addElement("Item4");

		JList<String> l = new JList<>(listModel);
		l.setBounds(50, 50, 150, 150);
		add(l);
		setLayout(null);
		setSize(250, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JListExample();
	}
}
