import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTableExample extends JFrame {

	JTable jTable;

	public JTableExample() {
		String[] columnNames = { "ID", "Firstname", "Lastname", "Country" };
		String[][] people = { { "101", "David", "Test", "Austria" }, { "102", "Jozica", "Test", "Germany" },
				{ "103", "Nika", "Test", "USA" }, { "104", "Domen", "Test", "Canada" },
				{ "105", "Eva", "Test", "Japan" }, { "106", "Joanne", "Test", "Luxembourg" },
				{ "107", "Denis", "Test", "France" } };
		jTable = new JTable(people, columnNames);

		jTable.setBounds(50, 50, 400, 200);
		add(jTable);

		setLayout(null);
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JTableExample();
	}
}
