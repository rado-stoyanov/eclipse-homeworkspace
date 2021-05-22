package buildingwar.manager;

public class KeyManager {
	
	public static final String FORWARD 		= "w";
	public static final String BACKWARD 	= "s";
	public static final String LEFT 		= "a";
	public static final String RIGHT 		= "d";
	
	public static final int TANK 			= 1;
	public static final int SNIPER 			= 2;
	public static final int SPY 			= 3;
	public static final int WRECKER 		= 4;
	
	//public static final String FIRE 		= "f";
	
	
	public static boolean isDirectionForward(String key) {
		return key.equals(FORWARD);
	}
	
	public static boolean isDirectionBackword(String key) {
		return key.equals(BACKWARD);
	}
	
	public static boolean isDirectionLeft(String key) {
		return key.equals(LEFT);
	}
	
	public static boolean isDirectionRight(String key) {
		return key.equals(RIGHT);
	}	
	
	public static boolean isDirectionKey(String keyCodeParameter) {
		
		return 	process(keyCodeParameter).equals(FORWARD) 	||
				process(keyCodeParameter).equals(LEFT) 	||
				process(keyCodeParameter).equals(BACKWARD) ||
				process(keyCodeParameter).equals(RIGHT);
	}
	
	public static boolean isSoldierKeyOption(int keyCodeParameter) {
		
		return 	
				keyCodeParameter == TANK	||
				keyCodeParameter == SNIPER 	||
				keyCodeParameter == SPY 	||
				keyCodeParameter == WRECKER;
	}
	
//	public static boolean isFireKey(String keyCodeParameter) {
//		
//		return 	process(keyCodeParameter).equals(FIRE);
//	}
	
	private static String process(String keyCodeParameter) {
		return keyCodeParameter.toLowerCase(); 
	}

}
