package examples;

//Anthony Marquez

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String[] args) {

		Robot lilBot = new Robot();
		
		lilBot.penDown();
		lilBot.setPenWidth(20);
		lilBot.setSpeed(20);
		
		lilBot.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			lilBot.move(100);
			lilBot.turn(90);
		}

		lilBot.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			lilBot.move(-100);
			lilBot.turn(90);
		}
			
		lilBot.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			lilBot.move(100);
			lilBot.turn(-90);
		}

		lilBot.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			lilBot.move(-100);
			lilBot.turn(-90);
		}

	}
}
