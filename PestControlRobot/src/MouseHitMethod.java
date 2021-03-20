public class MouseHitMethod {
	
	private static final int MISS_MOUSE 	 		= 5;
	private static final int MOUSE_HIT_RANGE_MIN 	= 1;
	private static final int MOUSE_HIT_RANGE_MAX	= 10;
	
	public static boolean mouseHit() {
	
		int randMouseHit = (int)(Math.random() * (MOUSE_HIT_RANGE_MAX - MOUSE_HIT_RANGE_MIN + 1) + MOUSE_HIT_RANGE_MIN); 
		
		if (randMouseHit == MISS_MOUSE) 
			{
			return false;
			}		
		return true;
	}	
}
