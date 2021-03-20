public class ChosenObjectMethod {
	
	private static final int OBJECT_ONE		= 0;
	private static final int OBJECT_TWO		= 1;
	private static final int OBJECT_THREE	= 2;
	
	public static void printObjectOptions() {
		String[] objectInFront = {"1. Wall", "2. Chair", "3. Nothing"};		
		ConsoleMethods.print("What is the object in front of you? \n" + objectInFront[OBJECT_ONE] + "\n" + objectInFront[OBJECT_TWO]+ "\n" + objectInFront[OBJECT_THREE]);
	}
	
	public static void printChoosenOptions() {	
			boolean isFinished = RobotCommunicationMethod.isProgramIsFinished();
			
			if(isFinished == false) {
				int chosenObject = ConsoleMethods.input("Choose object in front of you: ");	
				ActionMethod.actionWithSelectedObject(chosenObject);
			}
			else {
				ConsoleMethods.print("I finish my program.");
				System.exit(0);
			}		
	}
}
