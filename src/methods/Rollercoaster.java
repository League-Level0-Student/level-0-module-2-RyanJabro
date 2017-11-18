package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
String height;
	height = JOptionPane.showInputDialog("How tall are you in inches?");
	int heightNumber = Integer.parseInt(height);
	if(heightNumber > 48) {
	JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
	}
	else {
	JOptionPane.showMessageDialog(null, "Sorry, you are not tall enough to ride the rollercoaster.");
	}
	}
}
