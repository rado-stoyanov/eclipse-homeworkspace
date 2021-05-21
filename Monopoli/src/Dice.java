import java.util.Random;

public class Dice {
	
	private static final int UP_DICE_NUMBER_WITH_ONE = 1;
	
	public static int roll() {
		Random random = new Random();
		int diceNumber = random.nextInt(2);
		return diceNumber + UP_DICE_NUMBER_WITH_ONE;
	}
}
