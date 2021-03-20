public class DetectMouseMethod {
	
	private static final int MOUSE_PIXELS_RANGE_MIN 	= 1;
	private static final int MOUSE_PIXELS_RANGE_MAX		= 100;
	
	public static boolean mouseDetect() {
		int mousePixels = (int)(Math.random() * (MOUSE_PIXELS_RANGE_MAX - MOUSE_PIXELS_RANGE_MIN + 1) + MOUSE_PIXELS_RANGE_MIN); 
		boolean mouseInFront = ((mousePixels % 2) == 0);
		return mouseInFront;
	}
}
