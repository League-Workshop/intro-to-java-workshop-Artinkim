package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int playerh = 100;

		int dragonh = 100;

		int playerd = 100;

		int dragond = 100;

		while (playerh > 0 && dragonh > 0) {

			String answer = JOptionPane.showInputDialog("yell or kick");

			if (answer.equals("yell")) {
				dragond = new Random().nextInt(10);
				dragonh -= dragond;
			}

			if (answer.equals("kick")) {
				dragond = new Random().nextInt(25);
				dragonh -= dragond;
			}
			playerd = new Random().nextInt(35);

			playerh -= playerd;

			if (playerh <= 0) {
				JOptionPane.showMessageDialog(null, "You lost");
			} else {
				if (dragonh <= 0) {
					JOptionPane.showMessageDialog(null, "The dragon is dead and you take a ton of gold");
				} else {
					JOptionPane.showMessageDialog(null, "player health " + playerh);
					JOptionPane.showMessageDialog(null, "damage taken " + playerd);
					JOptionPane.showMessageDialog(null, "dragon health " + dragonh);
					JOptionPane.showMessageDialog(null, "attack damage " + dragond);
				}
			}

		}
	}
}




