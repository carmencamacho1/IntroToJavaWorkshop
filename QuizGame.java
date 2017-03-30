package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		System.out.println(score);
		String anthem = JOptionPane.showInputDialog("Question 1: What is the National Anthem of the U.S?");
		if (anthem.equalsIgnoreCase("The Star Spangled Banner")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		String director = JOptionPane
				.showInputDialog("Question 2: Who is the current director of Gompers Preparatory Acadmey?");
		if (director.equalsIgnoreCase("Vincent Riveroll")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		String continent = JOptionPane.showInputDialog("Question 3: Which continent is also a country?");
		if (continent.equalsIgnoreCase("Austrailia")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		String chess = JOptionPane.showInputDialog("Question : In a chess game, which color goes first?");
		if (chess.equalsIgnoreCase("white")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		String possible = JOptionPane.showInputDialog(
				"Question : If everything is possible, is it possible \n for something to be impossible?");
		if (possible.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		
		JOptionPane.showMessageDialog(null, "Your final score is " + score + " out of 5");
	}
}