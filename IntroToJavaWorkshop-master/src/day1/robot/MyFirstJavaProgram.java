package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Carmen = new Robot();
 Carmen.penDown();
 Carmen.setPenColor(Color.MAGENTA);
 Carmen.setPenWidth(50);
 Carmen.setSpeed(10);
int sides = 3;
 
	for (int i = 0; i < sides; i++) {
	Carmen.move (100);
 Carmen.turn(360/sides);
	
 
}

 

 
	
		
		
	}
}
