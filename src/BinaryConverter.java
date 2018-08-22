

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	public static void main(String[] args) {
	BinaryConverter binary = new BinaryConverter();
	binary.mouseListener();
	
}


private void mouseListener() {
	
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(answer);
	JButton button = new JButton();
	button.addActionListener(this);
	panel.add(button);
	
	panel.add(label);
	button.setText("convert");
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	String unconverted = answer.getText();
	String converted = convert(unconverted);
	label.setText(converted);
	frame.pack();
	
	
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}
