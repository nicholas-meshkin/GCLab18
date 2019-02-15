package lab18Yahtzee;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class YahtzeeScoreTest {
//commented out tests have not yet been added in YahtzeeScore.yahtzee method
	@Test
	public void testYahtzeeOnes1() {
		int[] roll= {1,2,3,4,5};
		String cat = "Ones";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(1,score);
	}
	@Test
	public void testYahtzeeOnes2() {
		int[] roll= {1,1,1,1,1};
		String cat = "Ones";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(5,score);
	}
	@Test
	public void testYahtzeeTwos1() {
		int[] roll= {1,2,3,4,5};
		String cat = "Twos";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(2,score);
	}
	@Test
	public void testYahtzeeTwos0() {
		int[] roll= {1,1,3,4,5};
		String cat = "Twos";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(0,score);
	}
	@Test
	public void testYahtzeeTwos5() {
		int[] roll= {2,2,2,2,2};
		String cat = "Twos";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(10,score);
	}
	
	@Test
	public void testYahtzeeThrees0() {
		int[] roll= {2,2,2,2,2};
		String cat = "Threes";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(0,score);
	}
	@Test
	public void testYahtzeeThrees1() {
		int[] roll= {2,2,2,2,3};
		String cat = "Threes";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(3,score);
	}
	@Test
	public void testYahtzeeThrees3() {
		int[] roll= {2,3,3,2,3};
		String cat = "Threes";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(9,score);
	}
	@Test
	public void testYahtzeeFours0() {
		int[] roll= {2,3,3,2,3};
		String cat = "Fours";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(0,score);
	}
	@Test
	public void testYahtzeeFours1() {
		int[] roll= {2,3,3,2,4};
		String cat = "Fours";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(4,score);
	}
	@Test
	public void testYahtzeeFours4() {
		int[] roll= {2,4,4,4,4};
		String cat = "Fours";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(16,score);
	}
	@Test
	public void testYahtzeeFives() {
		int[] roll= {2,5,5,5,4};
		String cat = "Fives";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(15,score);
	}
	@Test
	public void testYahtzeeSixes() {
		int[] roll= {2,5,5,6,6};
		String cat = "Sixes";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		
		assertEquals(12,score);
	}
//	@Test
//	public void testPair() {
//		int[] roll= {2,5,5,6,6};
//		String cat = "Pair";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(12,score);
//	}
//	@Test
//	public void testPair0() {
//		int[] roll= {2,5,3,6,1};
//		String cat = "Pair";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(0,score);
//	}
//	@Test
//	public void testTwoPair() {
//		int[] roll= {2,5,5,6,6};
//		String cat = "TwoPair";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(22,score);
//	}
//	@Test
//	public void testTwoPair0() {
//		int[] roll= {2,4,5,6,6};
//		String cat = "TwoPair";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(0,score);
//	}
//	@Test
//	public void testThreeOfAKind(){
//		int[] roll= {2,4,6,6,6};
//		String cat = "Three of a Kind";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(18,score);
//	}
//	@Test
//	public void testThreeOfAKind0(){
//		int[] roll= {2,4,4,6,6};
//		String cat = "Three of a Kind";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(0,score);
//	}
//	@Test
//	public void testFourOfAKind(){
//		int[] roll= {2,4,4,4,4};
//		String cat = "Four of a Kind";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(1,score);
//	}
//	@Test
//	public void testFourOfAKind0(){
//		int[] roll= {2,4,4,6,6};
//		String cat = "Four of a Kind";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(0,score);
//	}
	@Test
	public void testSmallStraight0(){
		int[] roll= {2,4,4,6,6};
		String cat = "Small Straight";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(0,score);
	}
	@Test
	public void testSmallStraight(){
		int[] roll= {1,2,3,4,5};
		String cat = "Small Straight";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(15,score);
	}
	@Test
	public void testLargeStraight0(){
		int[] roll= {1,2,3,4,5};
		String cat = "Large Straight";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(0,score);
	}
	@Test
	public void testLargeStraight(){
		int[] roll= {2,3,4,5,6};
		String cat = "Large Straight";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(20,score);
	}
//	@Test
//	public void testFullHouse(){
//		int[] roll= {3,3,6,6,6};
//		String cat = "Full House";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(24,score);
//	}
//	@Test
//	public void testFullHouse0(){
//		int[] roll= {3,3,4,6,6};
//		String cat = "Full House";
//		int score = YahtzeeScore.yahtzee(roll, cat);
//		
//		assertEquals(0,score);
//	}
	@Test
	public void testYahtzee(){
		int[] roll= {6,6,6,6,6};
		String cat = "Yahtzee";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(50,score);
	}
	@Test
	public void testYahtzee0(){
		int[] roll= {6,5,6,6,6};
		String cat = "Yahtzee";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(0,score);
	}
	@Test
	public void testChance(){
		int[] roll= {6,2,1,3,2};
		String cat = "Chance";
		int score = YahtzeeScore.yahtzee(roll, cat);
		
		assertEquals(14,score);
	}
	
}