//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
	
	
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		// 0 1 0 4 0 4 0 3 4 4


		// 3. Use each value of randomNumber to give the user a random compliment.
for(int i = 0; i<10; i++) {
	int randomNumber = new Random().nextInt(5);
	System.out.println(randomNumber);
	if(randomNumber == 0) {
		System.out.println("You are wearing a fantasic shirt!");
}
else if(randomNumber == 1) {
	System.out.println("Nice shoes!");
}
else if(randomNumber == 2) {
	System.out.println("Nice hair!");
}
else if(randomNumber == 3) {
	System.out.println("You are extraordinary!");
}
else if(randomNumber == 3) {
	System.out.println("You are special!");
}
}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
