package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	String animal;
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
for (int i = 0; i < 9999; i++) {
	animal = JOptionPane.showInputDialog("What animal? (Cow, duck, dog, cat, llama)");
	/* 2. Make it so that the user can keep entering new animals. */
if(animal.equalsIgnoreCase("Cow")) {
playMoo();
}
else if(animal.equalsIgnoreCase("Duck")) {
playQuack();
}
else if(animal.equalsIgnoreCase("Dog")) {
playWoof();
}
else if(animal.equalsIgnoreCase("Cat")) {
playMeow();
}
else if(animal.equalsIgnoreCase("Llama")) {
playLlama();
}
else {
JOptionPane.showMessageDialog(null, "I don't know that animal! :(");
}
}
}
void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}
void playMeow() {
	playNoise(meowFile);
}
void playLlama() {
	playNoise(llamaFile);
}
String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

