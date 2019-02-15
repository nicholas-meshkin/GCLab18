package lab18Yahtzee;

import java.util.ArrayList;

public class YahtzeeScore {

	public static int yahtzee(int[] dice, String cat) {
		int score = 0;
		
		if(cat.equalsIgnoreCase("Small Straight")) {
			ArrayList<Integer> sTest = new ArrayList<>();
			for(int i=0;i<dice.length;i++) {
				sTest.add(dice[i]);
			}
			if(sTest.contains(1)&&sTest.contains(2)&&sTest.contains(3)&&sTest.contains(4)&&sTest.contains(5)) {
				score = 15;
			}
			
		}
		
		if(cat.equalsIgnoreCase("Large Straight")) {
			ArrayList<Integer> sTest = new ArrayList<>();
			for(int i=0;i<dice.length;i++) {
				sTest.add(dice[i]);
			}
			if(sTest.contains(2)&&sTest.contains(3)&&sTest.contains(4)&&sTest.contains(5)&&sTest.contains(6)) {
				score = 20;
			}
			
		}
		
		if (cat.equalsIgnoreCase("Yahtzee")) {
			boolean same = true;
			int firstDie = dice[0];
			for(int i = 1;i<dice.length;i++) {
				if(firstDie!=dice[i]) {
					same=false;
					score = 0;
				}
			}
			if(same) {
				score=50;
			}
		}
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
