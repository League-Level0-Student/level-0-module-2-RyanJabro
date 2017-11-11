package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
int number;
String lottery = "";
for (int i = 0; i < 5; i++) {
	

number = new Random().nextInt(60);
String x = Integer.toString(number);
lottery = lottery + " " + x;
}
JOptionPane.showMessageDialog(null, lottery);
}
}