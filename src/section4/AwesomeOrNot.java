package section4;

import java.util.Random;
import javax.swing.*;

public class AwesomeOrNot {
	public static void main(String[] args) {
		int number = new Random().nextInt(4);
		String answer = JOptionPane.showInputDialog("What is awesome");
		if (number == 0) {
			JOptionPane.showMessageDialog(null, answer + " is awesome");
		}

		if (number == 1) {
			JOptionPane.showMessageDialog(null, answer + " ok");
		}

		if (number == 2) {
			JOptionPane.showMessageDialog(null, answer + " boring");
		}
		if (number == 3) {
			JOptionPane.showMessageDialog(null, answer + " is cool");
		}
	}
}
