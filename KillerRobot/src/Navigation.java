public class Navigation {
	
	public static String getDirection(int obsticleIndex) {
		
		if(obsticleIndex == 1) {
			return "Go Sideway";
		}
		if(obsticleIndex == 2) {
			return "Jump";
		}	
		return "Forward";
	}

}
