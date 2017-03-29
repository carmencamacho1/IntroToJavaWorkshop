package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showConfirmDialog(null, "You are in the Amazon river \n which is infested whith flesh eating \n Piranhas.");
		// Get the user to enter an adjective
String adjective = JOptionPane.showInputDialog("Adjective");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog("Type of Liquid");
		// Get the user to enter a body part
String bodypart = JOptionPane.showInputDialog("Name a body part");
		// Get the user to enter a verb
String verb = JOptionPane.showInputDialog("Verb");
		// Get the user to enter a place
String place = JOptionPane.showInputDialog("Place");
		String story = "Piranhas are more " + adjective + " during the day, so cross the river at  night\n"  + 
				"Piranhas are attracted to fresh " + liquid + " and will most likely take a bite out of your " + bodypart + " if you " + verb + "\n" + 
				"Whatever you do, if you have an open wound, try to find another way to get back to the " + place + "\n" + "Good luck!";
						
		
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showConfirmDialog(null, story);

	}
}

