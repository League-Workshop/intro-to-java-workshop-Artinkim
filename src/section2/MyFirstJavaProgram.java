package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
Robot r2d2 = new Robot();
r2d2.setPenColor(100,0,100);
r2d2.penDown();
r2d2.setSpeed(1000);
for(int i = 0;i < 360;i++)
{
r2d2.turn(1);
r2d2.move(1);
}

	}
	
}
