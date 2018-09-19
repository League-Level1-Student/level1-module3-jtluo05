import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JLabel label1=new JLabel();
JLabel label3=new JLabel();
JLabel label2=new JLabel();
JButton button=new JButton();

public static void main(String[] args) throws MalformedURLException {
	SlotMachine sm=new SlotMachine();
	sm.createUI();
}

void createUI() throws MalformedURLException {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	button.setText("SPIN!!!");
	button.addActionListener(this);
	label1=createLabelImage("apple.jpg");
	label2=createLabelImage("orange.jpg");
	label3=createLabelImage("pomegranite.jpg");
	panel.add(label3);
	panel.add(label2);
	panel.add(label1);
	panel.add(button);
	frame.add(panel);
	frame.pack();
	Random r=new Random();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


private JLabel createLabelImage(String fileName) throws MalformedURLException {
	URL imageURL = getClass().getResource(fileName);
	if (imageURL == null) {
		System.err.println("Could not find image " + fileName);
		


	

	}
	return  new JLabel();
}
}
