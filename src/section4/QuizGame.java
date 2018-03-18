package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
int score = 0;
		
String answer = JOptionPane.showInputDialog("12x6");
		
	if(answer .equals("72"))
	{
	score ++;	
	}
	else
	{
		score --;		
	}
	
	 answer = JOptionPane.showInputDialog("15 digits of pi");
	
	if(answer .equals("3.14159265358979"))
	{
	score ++;	
	}
	else
	{
	score --; 	
	}
	
 answer = JOptionPane.showInputDialog("Are dogs better than cats?");
	
	if(answer .equalsIgnoreCase("yes"))
	{
	score ++;	
	}
	else
	{
	score --; 	
	}	
	
	JOptionPane.showMessageDialog(null,(double) score/3*100 +"%");
		

	}
}
