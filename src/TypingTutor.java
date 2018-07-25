
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	char currentLetter;
	Random r;
	int j=0;
	JLabel label = new JLabel();
JPanel panel=new JPanel();
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.createGUI();
	}

	void createGUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		label.setText("");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		frame.addKeyListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

	char generateRandomLetter() {
		r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		if (currentLetter == e.getKeyChar()) {
			System.out.println("CORRECT!!!!!You typed the correct letter!");
			panel.setBackground(Color.GREEN);
		
		} else {
			System.out.println("ERRRR! Wrong answer. The correct answer was " + e.getKeyChar());
			panel.setBackground(Color.RED);

		}
		label.setText("");
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
j=j+1;
if (j<=20) {
	showTypingSpeed(20) ;
}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();



}
