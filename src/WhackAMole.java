import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	Random r = new Random();
	int randomnumber;
	JButton mole;
	static Date timeatstart;
	int molesHit = 0;

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.createUI();
		timeatstart = new Date();
	}

	void createUI() {
		frame = new JFrame();
		panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		randomnumber = r.nextInt(25);
		for (int i = 0; i < 24; i++) {

			button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == randomnumber) {
				button.setText("MOLE");
				mole = button;
			}
		}

		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == mole) {
			frame.dispose();
			createUI();
			molesHit++;
			System.out.println(molesHit);
		} else

		{
			speak("Wrong!");
		}
		if (molesHit > 9) {
			endGame(timeatstart, 10);
System.exit(0);
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}
