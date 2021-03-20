public class ActionMethod {
	
	private static final int TASK_FOR_WALL_OBJECT 		= 1;
	private static final int TASK_FOR_CHAIR_OBJECT 		= 2;
	private static final int TASK_FOR_NOTHING_OBJECT 	= 3;

	public static void actionWithSelectedObject(int chosenObject) {
		
		if (chosenObject == TASK_FOR_WALL_OBJECT) 
			{
			ConsoleMethods.print("Go Sideway");
			IsMouseAroundMethod.mouseCheck();
			}
		
		else if (chosenObject == TASK_FOR_CHAIR_OBJECT) 
			{
			ConsoleMethods.print("Jump");
			IsMouseAroundMethod.mouseCheck();
			}
		
		else if (chosenObject == TASK_FOR_NOTHING_OBJECT) 
			{
			ConsoleMethods.print("Forward");
			IsMouseAroundMethod.mouseCheck();
			}
		else {
			ChosenObjectMethod.printChoosenOptions();
		}
			
	}
}
