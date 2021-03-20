public class AmperageMethod {
	
	private static final int AMPERAGE_RANGE_MIN = 1;
	private static final int AMPERAGE_RANGE_MAX = 1000;
	
	public static boolean isAmperageAvailable() {
				
		int firstAmperageNumber = (int)(Math.random() * (AMPERAGE_RANGE_MAX - AMPERAGE_RANGE_MIN + 1) + AMPERAGE_RANGE_MIN); 
		int secondAmperageNumber = (int)(Math.random() * (AMPERAGE_RANGE_MAX - AMPERAGE_RANGE_MIN + 1) + AMPERAGE_RANGE_MIN); 
				
		if (firstAmperageNumber > secondAmperageNumber) return true;		
		if (firstAmperageNumber < secondAmperageNumber) return false;
		
		ConsoleMethods.print("I miss the charger station. I will try again.");
		isAmperageAvailable();
		return false;			
	}
}
