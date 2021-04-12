import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxExample2 extends JFrame implements ActionListener {
	JLabel labelTitle;
	JLabel labelPizza;
	JLabel labelBurger;
	JLabel labelTea;

	JCheckBox checkboxPizza;
	JCheckBox checkboxBurger;
	JCheckBox checkboxTea;

	JButton buttonOrder;

	public CheckBoxExample2() {
		labelTitle = new JLabel("Food Ordering System");
		labelPizza = new JLabel("Pizza 8.7 EUR");
		labelBurger = new JLabel("Burger 4.5 EUR");
		labelTea = new JLabel("Tea 2.5 EUR");

		checkboxPizza = new JCheckBox();
		checkboxBurger = new JCheckBox();
		checkboxTea = new JCheckBox();

		buttonOrder = new JButton("Order");

		checkboxPizza.setBounds(60, 80, 20, 20);
		checkboxBurger.setBounds(60, 110, 20, 20);
		checkboxTea.setBounds(60, 140, 20, 20);

		labelTitle.setBounds(120, 40, 200, 20);
		labelPizza.setBounds(80, 80, 120, 20);
		labelBurger.setBounds(80, 110, 120, 20);
		labelTea.setBounds(80, 140, 120, 20);
		buttonOrder.setBounds(90, 180, 150, 30);

		add(labelTitle);
		add(labelPizza);
		add(labelBurger);
		add(labelTea);
		add(checkboxPizza);
		add(checkboxBurger);
		add(checkboxTea);
		add(buttonOrder);

		buttonOrder.addActionListener(this);

		setSize(350, 300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double amount = 0;
		StringBuilder outputOrder = new StringBuilder();

		if (checkboxPizza.isSelected()) {
			amount += 8.7;
			outputOrder.append("Pizza 8.7 EUR\n");
		}

		if (checkboxBurger.isSelected()) {
			amount += 4.5;
			outputOrder.append("Burger 4.5 EUR\n");
		}

		if (checkboxTea.isSelected()) {
			amount += 2.5;
			outputOrder.append("Tea 2.5 EUR\n");
		}

		outputOrder.append("===========\n");
		outputOrder.append("Total: " + amount + " EUR");

		JOptionPane.showMessageDialog(this, outputOrder);
	}

	public static void main(String[] args) {
		CheckBoxExample2 JObjekt = new CheckBoxExample2();
	}
}
