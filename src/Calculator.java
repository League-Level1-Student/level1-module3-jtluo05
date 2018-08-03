import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JTextField tf = new JTextField();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

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

		return input1 * input2 + "";
	}

	public String div(String input1, String input2) {
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);

		return input1 / input2 + "";
	}

}
