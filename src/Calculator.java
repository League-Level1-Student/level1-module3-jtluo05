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
	private JLabel label = new JLabel();
	private JButton button1 = new JButton();
	private JButton button2 = new JButton();
	private JButton button3 = new JButton();
	private JButton button4 = new JButton();

	void createUI() {
		frame.setVisible(true);
		frame.setSize(300, 300);
		panel.add(tf1);
		panel.add(tf2);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
		button1.setText("add");
		button2.setText("sub");
		button3.setText("mul");
		button4.setText("div");
		panel.add(label);
		frame.add(panel);
		frame.pack();

	}

	public String add(String input1, String input2) {
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);
		return input1 + input2;
	}

	public String sub(String input1, String input2) {

		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);

		return int1 - int2 + "";
	}

	public String mul(String input1, String input2) {
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);

		return int1 * int2 + "";
	}

	public String div(String input1, String input2) {
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);

		return int1 / int2 + "";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
