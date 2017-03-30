package day3;

import javax.swing.JOptionPane;

public class MadLibs2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You are going to the beach to surf the biggest wave ever.");
		String name = JOptionPane.showInputDialog("Friend's Name");
		String place = JOptionPane.showInputDialog("Place");
		String adjective = JOptionPane.showInputDialog("Adjective");
		String adjective1 = JOptionPane.showInputDialog("Adjective");
		String object = JOptionPane.showInputDialog("Object");
		String adjective2 = JOptionPane.showInputDialog("Adjective");
		String color = JOptionPane.showInputDialog("Color");
		String adj3 = JOptionPane.showInputDialog("Adjective");
		String emotion = JOptionPane.showInputDialog("Emotion");
		String time = JOptionPane.showInputDialog("Amount of time");
		String adj4 = JOptionPane.showInputDialog("Adjective");
	JOptionPane.showMessageDialog(null, "You and your friend, " + name + " are going to the beach in \n " +
		place + " You are " + adjective + " to go. At the same time, you are scared \n because your mom said  there would be "
				+ adjective1 + " sharks. \n When you get to the beach, it is full of " + object + ". \n You get on your " + adjective2 + " " + color  + 
				" surfboard.  \n You see a " + adj3 + " wave ahead of you. \n You take a deep breath as the wave carries you away. \n You feel so " + emotion + " and "
			  + " wish to do this every " + time + ". \n This was the most " + adj4 + " experience ever.");
	}
	}

