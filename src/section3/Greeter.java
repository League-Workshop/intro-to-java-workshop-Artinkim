package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("Name");
JOptionPane.showMessageDialog(null, "Hello, " + answer + " my name is " + answer + "y");
	}
}
