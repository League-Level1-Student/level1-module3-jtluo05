import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	private JTextField tf1 = new JTextField(10);
	private JTextField tf2 = new JTextField(10);
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("0");
	private JButton add = new JButton();
	private JButton sub = new JButton();
	private JButton mul = new JButton();
	private JButton div = new JButton();

	void createUI() {
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel.add(tf1);
		panel.add(tf2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		panel.add(label);
		frame.add(panel);
		frame.pack();

	}

	public String add(String input1, String input2) {
		double int1 = Double.parseDouble(input1);
		double int2 = Double.parseDouble(input2);
		double answer=int1 + int2;
		System.out.println(answer);
		return String.valueOf(answer);
	}

	public String sub(String input1, String input2) {

		double int1 = Double.parseDouble(input1);
		double int2 = Double.parseDouble(input2);

		return int1 - int2 + "";
	}

	public String mul(String input1, String input2) {
		double int1 = Double.parseDouble(input1);
		double int2 = Double.parseDouble(input2);

		return int1 * int2 + "";
	}

	public String div(String input1, String input2) {
		double int1 = Double.parseDouble(input1);
		double int2 = Double.parseDouble(input2);

		return int1 / int2 + "";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String answer = "";
		if (e.getSource() == add) {
			answer = add(tf1.getText(), tf2.getText());
		} else if (e.getSource() == sub) {
			answer = sub(tf1.getText(), tf2.getText());
		} else if (e.getSource() == mul) {
			answer = mul(tf1.getText(), tf2.getText());
		} else {
			answer = div(tf1.getText(), tf2.getText());

		}
		label.setText(answer);
		frame.pack();
	}

}
