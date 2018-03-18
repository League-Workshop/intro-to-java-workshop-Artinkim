package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		speak("Mandlebrot");

		String answer = JOptionPane.showInputDialog("Spell it");

		while(answer.equalsIgnoreCase("repeat"))
		{
			speak("Mandlebrot");
			answer = JOptionPane.showInputDialog("Spell it");	
		}
		  {
			if (answer.equalsIgnoreCase("Mandlebrot")) {
				speak("Correct");
			} else {
				speak("Wrong");
			}
		}

		speak("eliquient");

		answer = JOptionPane.showInputDialog("Spell it");

		if (answer.equalsIgnoreCase("repeat")) {
			speak("eliquient");
		}

		if (answer.equalsIgnoreCase("eliquient")) {
			speak("Correct");
		} else {
			speak("Wrong");
		}

		speak("vernacular");

		answer = JOptionPane.showInputDialog("Spell it");

		if (answer.equalsIgnoreCase("repeat")) {
			speak("vernacular");
		}

		if (answer.equalsIgnoreCase("vernacular")) {
			speak("Correct");
		} else {
			speak("Wrong");
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
