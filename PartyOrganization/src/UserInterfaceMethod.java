
public class UserInterfaceMethod {
	
	private static final int MAX_EVENTS = 10;
	private static final int MAX_VISITORS = 15;
	
	private static int eventsCounter = 0;
	private static int visitorsCounter = 0;
	
	
	public static void insertEvent() {
		boolean isAccessableForAll = true;			
		Console.log("Please insert new Event!");	
		String title = Console.promtString("Insert Event Title: ");
		String applicableForUnderage = Console.promtString("Is Event is applicable for underage (Yes/No):  ");		
		boolean isApplicableForUnderage = (applicableForUnderage.equals("Yes") || applicableForUnderage.equals("yes"));
		boolean isNotApplicableForUnderage = (applicableForUnderage.equals("No") || applicableForUnderage.equals("no"));		
		if(isApplicableForUnderage) {
			isAccessableForAll = true;
		}
		if(isNotApplicableForUnderage) {
			isAccessableForAll = false;
		}	
		String day = Console.promtString("Insert Event day (DD/MM/YYYY): ");
		Organizer.newEventCreator(title, isAccessableForAll, day);		
	}
	
	
	public static void insertVisitor() {
		Console.log("Please insert new Visitor! Our events are for visitors from 6 to  85 years old.");
		String fname = Console.promtString("Insert your first name: ");
		String lname = Console.promtString("Insert your last name: ");
		String gender = Console.promtString("Insert your gender (M/F): ");
		int age = Console.promtInt("Insert your age: ");	
		Organizer.newVisitorCreator(fname, lname, gender, age);	
	}
	
	
	public static void updateEventTitle() {
		int eventNumber = Console.promtInt("Please insert event for update: ");
		String title = Console.promtString("Please insert new title: ");
		Organizer.updateEventCollection(eventNumber, title);
	}
	
	public static void updateEventAccessibility() {
		boolean isAccessableForAll = true;
		int eventNumber = Console.promtInt("Please insert event for update: ");		
		String applicableForUnderage = Console.promtString("Please insert new event accessibility (Yes/No):  ");		
		boolean isApplicableForUnderage = (applicableForUnderage.equals("Yes") || applicableForUnderage.equals("yes"));
		boolean isNotApplicableForUnderage = (applicableForUnderage.equals("No") || applicableForUnderage.equals("no"));		
		if(isApplicableForUnderage) {
			isAccessableForAll = true;
		}
		if(isNotApplicableForUnderage) {
			isAccessableForAll = false;
		}		
		Organizer.updateEventCollection(eventNumber, isAccessableForAll);
	}
	
	public static void removeEvent() {
		int eventNumber = Console.promtInt("Please insert event for removing: ");
		Organizer.deleteEventCollection(eventNumber);
	}
	
	public static void addVisitorToEvent() {
		int eventNumber = Console.promtInt("Please insert event: ");
		int visitorNumber = Console.promtInt("Please insert visitor: ");
		Organizer.addVisitorToEvent(eventNumber, visitorNumber);
	}
	
	public static void removeVisitorToEvent() {
		int eventNumber = Console.promtInt("Please insert event: ");
		int visitorNumber = Console.promtInt("Please insert visitor: ");
		Organizer.removeVisitorFromEvent(eventNumber, visitorNumber);
	}
	
	public static void printEventWithVisitors() {
		int eventNumber = Console.promtInt("Please insert event: ");	
		Organizer.printEventWithCustomers(eventNumber);
	}
	
	public static void printEventWithVisitorsByGender() {
		int eventNumber = Console.promtInt("Please insert event: ");
		String gender = Console.promtString("Please insert gender (M/F): ");
		Organizer.printEventWithCustomers(eventNumber, gender);
	}


	public static void choosenOption(){
		optionItems();
		int choosenOption = Console.promtInt("Please insert option you want: ");
		choosenLogic(choosenOption);
		
	}
	
	private static void optionItems(){		
		String[] Options = {
				"1. Add new Event",
				"2. Update Event Title",
				"3. Update Event accessibility",
				"4. Remove Event.",
				"5. Print all Events",
				"6. Add new Visitor",
				"7. Add Visitor to Event",
				"8. Remove Visitor From Event",
				"9. Print Event with all Visitors",
				"10. Print Event with Visitors by gender (M/F)",
				"11. Print Event with maximum visitors",
				"12. Print Events accessable for all",
				"13. Print Events filtered",
				"14. Exit"
		};
		Console.log("Menu List:");
		for(int i = 0 ; i < Options.length ; i++){
			Console.log(Options[i]);
		}		
	}
	
	
	private static void choosenLogic(int optionNumber){ 	
		 
		switch (optionNumber) {
         case 1: 
        	 isEventCounterMax();
        	 insertEvent();
        	 eventsCounter++;
        	 ExitOrContinue();
         case 2:
        	 updateEventTitle();
        	 ExitOrContinue();
         case 3:
        	 updateEventAccessibility();
        	 ExitOrContinue();
         case 4:
        	 removeEvent();
        	 ExitOrContinue();
         case 5:
        	 Organizer.printEventCollections();
        	 ExitOrContinue();       	 
         case 6:
        	 isVisitorsCounterMax();
        	 insertVisitor();
        	 visitorsCounter++;
        	 ExitOrContinue();
         case 7:     	 
        	 addVisitorToEvent();        	
        	 ExitOrContinue();
         case 8:
        	 removeVisitorToEvent();
        	 ExitOrContinue();
         case 9:
        	 printEventWithVisitors();
        	 ExitOrContinue();
         case 10:
        	 printEventWithVisitorsByGender();
        	 ExitOrContinue();
         case 11:
        	 Organizer.printEventWithMaximumVisitors();
        	 ExitOrContinue();
         case 12:
        	 Organizer.printEventsAccessableForAll();
        	 ExitOrContinue();
         case 13:
        	 Organizer.printEventsAccessableForAllFiltered();
        	 Organizer.printEventsNotAccessableForAllFiltered();
        	 ExitOrContinue();
         case 14:
        	 Console.log("Have a nice day!");
			 System.exit(0);      	 
         default: 
        	 Console.log("Wrong command! Try again!");
        	 ExitOrContinue();		
		}
	}
	
	
	private static void ExitOrContinue(){
		final int firstCommand = 1;
		final int secondCommand = 2;
		
		String[] SecondOptions = {
				"1. Continue in program",
				"2. Exit",
		};
		
		Console.log("Menu List:");
		
		for(int i = 0 ; i < SecondOptions.length ; i++){
			Console.log(SecondOptions[i]);
		}
		
		int forwardedOption = Console.promtInt("Please insert option you want: ");
		
		if(forwardedOption == firstCommand){
			choosenOption();
		}
		if(forwardedOption == secondCommand){
			Console.log("Have a nice day!");
			System.exit(0);
		}
		else{
			Console.log("Wrong command! Try again!");
			ExitOrContinue();
		}
	}
	
	private static void isEventCounterMax() {		
		if(eventsCounter == MAX_EVENTS) {
			Console.log("The maximum number of events has been reached. Try another operation.");
			choosenOption();
		}
	}
	
	private static void isVisitorsCounterMax() {		
		if(visitorsCounter == MAX_VISITORS) {
			Console.log("The maximum number of events has been reached. Try another operation.");
			choosenOption();
		}
	}
	
	
	
	

}
