import java.util.Random;

public class BattlerStrategy {
	
	private static final int MAX_NUMBER_OF_HITS = 4;	
	private static final int HIT_ATTACK_COEFFICIENT = 5;	
	private static int numberOfHits = 0;
	
	public static void incrementSuccessHit() {
		numberOfHits++;
	}
	
	public static void recharge() {
		numberOfHits = 0;		
	}

	public static boolean isHitSuccesful(int pixelLength) {
		return isEnemyAvailable(pixelLength) &&
				isAttackSafeForExecution() &&
				hasBattery();
	}
	
	
	private static boolean isEnemyAvailable(int pixelLength) {		
		return pixelLength % 2 == 0;		
	}
	
	public static boolean hasBattery() {
		return numberOfHits < MAX_NUMBER_OF_HITS;
	}
	
	private static boolean isAttackSafeForExecution() {
		
		Random randomGenerator = new Random();
		int randomGeneratorHitIndex = randomGenerator.nextInt(11);
		
		return randomGeneratorHitIndex != HIT_ATTACK_COEFFICIENT;
	}




}
