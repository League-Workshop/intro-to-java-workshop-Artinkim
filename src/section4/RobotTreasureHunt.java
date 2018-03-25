package section4;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URI;

import javax.swing.JOptionPane;

//import org.teachingextensions.logo.ImageBackground;
//import org.teachingextensions.logo.Paintable;
//import org.teachingextensions.logo.robot;
import org.jointheleague.graphical.robot.Robot;

public class RobotTreasureHunt implements KeyEventDispatcher {

	Robot robot = new Robot("mini");

	private void goUp() throws InterruptedException {
		robot.setAngle(0);
		robot.microMove(5);

	}

	private void goDown() throws InterruptedException {
		robot.setAngle(180);
		robot.microMove(5);

	}

	private void turnLeft() throws InterruptedException {
		robot.setAngle(270);
		robot.microMove(5);

	}

	private void turnRight() throws InterruptedException {
		robot.setAngle(90);
		robot.microMove(5);

	}

	private void spaceBarWasPressed() {

		int robotXLocation = robot.getX();
		int robotYLocation = robot.getY();

		System.out.println(robotXLocation);
		System.out.println(robotYLocation);

		if (dist(robotXLocation, 720, 30) && dist(robotYLocation, 405, 30)) {
			JOptionPane.showMessageDialog(null, "go to the boy");
		}
		if (dist(robotXLocation, 210, 30) && dist(robotYLocation, 384, 30)) {
			treasureFound();
		}

	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Robot.setWindowImage("section4/treasure_hunt.jpg");

		JOptionPane.showMessageDialog(null, "Ask the girl for help with your quest. Press the space bar to ask.");

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				try {
					turnRight();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				try {
					turnLeft();
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			else if (e.getKeyCode() == 38)
				try {
					goUp();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				try {
					goDown();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	static void treasureFound() {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=G0aIg4N6aro");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws MalformedURLException {
		new RobotTreasureHunt().go();
	}

	public boolean dist(int a, int b, int c) {
		return Math.abs(a - b) < c;
	}
}
