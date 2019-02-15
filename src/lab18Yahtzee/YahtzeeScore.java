package lab18Yahtzee;

import java.util.ArrayList;

public class YahtzeeScore {

	public static int yahtzee(int[] dice, String cat) {
		int score = 0;
		if (cat.equalsIgnoreCase("Chance")) {
			for(int i=0;i<dice.length;i++) {
				score += dice[i];
			}
			
		}

		if (cat.equalsIgnoreCase("Ones")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 1) {
					score++;
				}
			}

		}
		if (cat.equalsIgnoreCase("Twos")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 2) {
					score++;
				}
			}
			score*=2;

		}
		if (cat.equalsIgnoreCase("Threes")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 3) {
					score++;
				}
			}
			score*=3;

		}
		if (cat.equalsIgnoreCase("Fours")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 4) {
					score++;
				}
			}
			score*=4;

		}
		if (cat.equalsIgnoreCase("Fives")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 5) {
					score++;
				}
			}
			score*=5;

		}
		if (cat.equalsIgnoreCase("Sixes")) {
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] == 6) {
					score++;
				}
			}
			score*=6;

		}
		return score;
	}
}
