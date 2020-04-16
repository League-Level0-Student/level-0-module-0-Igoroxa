package _01_robot._2_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	

	Robot igor = new Robot();
igor.penDown();
igor.setSpeed(100);
igor.move(100);
	igor.turn(90);
	igor.move(50);
	igor.turn(180);
	igor.move(100);
igor.turn(180);
igor.move(50);
igor.turn(90);
igor.move(200);
igor.turn(90);
igor.move(50);
igor.turn(180);
igor.move(100);
}

}