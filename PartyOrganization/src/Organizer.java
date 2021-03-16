import java.util.ArrayList;
import party.*;

public class Organizer {

	private static int eventIdIndex = 1000;
	private static ArrayList<Event> allEventsCollection = new ArrayList<Event>();
	
	private static int visitorIdIndex = 0;
	private static ArrayList<Visitor> allVisitorsCollection = new ArrayList<Visitor>();
	
	
	/*Create new Event for 18+ or 6+ visitors*/
	public static void newEventCreator(String title, boolean isAccessibleForAll, String day) {		
		Event newEvent = new Event((++eventIdIndex), title, isAccessibleForAll, day);
		allEventsCollection.add(newEvent);
	}
	/*Create new Event for All visitors (6+)*/
	public static void newEventCreator(String title, String day) {
		newEventCreator(title, true, day);
	}	
	/*Create new Visitor*/
	public static void newVisitorCreator(String fname, String lname, String gender, int age) {
		Visitor newVisitor = new Visitor((visitorIdIndex++), fname, lname, gender, age);
		allVisitorsCollection.add(newVisitor);
	}	
	//Print Event Collection*/
	public static void printEventCollections() {
		for(Event object : allEventsCollection) {
			if(object != null) {
				object.render();
			}		
		}
	}	
	/*Print Visitor Collection*/
	public static void printVisitorCollections() {
		for(Visitor object : allVisitorsCollection) {
			if(object != null) {
				object.render();
			}
		}
	}	
	/*Delete Event Collection*/
	public static void deleteEventCollection(int index) {		
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {					
			if(allEventsCollection.get(i).getId() == index && allEventsCollection.get(i) != null) {
				System.out.println("You Delete the Event " + (allEventsCollection.get(i).getId()));
				allEventsCollection.remove(i);	
				break;
			}		
		}	
	}	
	/*Update Event Collection*/
	public static void updateEventCollection(int index, String title) {	
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {					
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == index) {
				allEventsCollection.get(i).setTitle(title);
				System.out.println("You Changed the Title " + (allEventsCollection.get(i).getId()));
				break;
			}		
		}		
	}
	
	/*Update Event Collection*/
	public static void updateEventCollection(int index, boolean isAccessibleForAll) {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {					
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == index) {
				allEventsCollection.get(i).setIsAccessableForAll(isAccessibleForAll);
				System.out.println("You Changed the Access type " + (allEventsCollection.get(i).getId()));
				break;
			}		
		}	
	}

	/*Find Event By ID*/
	public static Event findEventById(int index) {		
		for (int i = 0 ; i < allEventsCollection.size() ; i++) {
			if (allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == index) {
				return allEventsCollection.get(i);
			}
		}
		return null;
	}
	/*Print Event By ID*/
	public static void printFindEvent(int index) {
		if(findEventById(index) != null) {
			System.out.printf("You found the %d event:\n",index);
			findEventById(index).render();
		}else {
			System.out.println("Your event is not found");
		}	
	}
	/*Add Visitor to Event*/
	public static void addVisitorToEvent(int eventIndex, int visitorIndex) {		
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == eventIndex) {
				allEventsCollection.get(i).addVisitor(allVisitorsCollection.get(visitorIndex-1), allEventsCollection.get(i).getIsAccessableForAll());
			}
		}	
	}
	/*Print Event with Customers by gender*/
	public static void printEventWithCustomers(int eventIndex, String gender) {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == eventIndex) {
				allEventsCollection.get(i).render();
				if(allEventsCollection.get(i).visitorsCollection.get(i) != null) {
					allEventsCollection.get(i).listVisitors(gender);
				}else {
					System.out.println("No Visitors");
				}		
			}
		}
	}
	/*Print Events AccessableForAll*/
	public static void printEventsAccessableForAll() {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getIsAccessableForAll() == true) {
				allEventsCollection.get(i).render();		
			}
		}
	}
	/*Print Event with all Customers 6+ filtered*/
	public static void printEventsAccessableForAllFiltered() {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getIsAccessableForAll() == true) {
				allEventsCollection.get(i).filterRender();		
			}
		}
	}
	/*Print Event with all Customers 18+ filtered*/
	public static void printEventsNotAccessableForAllFiltered() {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getIsAccessableForAll() == false) {
				allEventsCollection.get(i).filterRender();		
			}
		}
	}
	
	/*Print Event with all Customers*/
	public static void printEventWithCustomers(int eventIndex) {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == eventIndex) {
				allEventsCollection.get(i).render();
				if(allEventsCollection.get(i).visitorsCollection != null) {
					allEventsCollection.get(i).listVisitors();
				}					
			}
		}
	}
	/*Remove Visitor from Event*/
	public static void removeVisitorFromEvent(int eventIndex, int visitorIndex) {
		for(int i = 0 ; i < allEventsCollection.size() ; i++) {
			if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getId() == eventIndex) {
				allEventsCollection.get(i).removeVisitor(visitorIndex-1);
			}
		}
	}
	
	/*Print Event with maximum Visitors*/
	public static void printEventWithMaximumVisitors() {	
		
		int[] visitorsToEvent = new int[allEventsCollection.size()];
				
		if(allEventsCollection.size() != 0) {
			for(int i = 0 ; i < allEventsCollection.size() ; i++) {
				if(allEventsCollection.get(i) != null) {
					visitorsToEvent[i] = allEventsCollection.get(i).getNumberOfVisitorsToEvent();
				}else {
					System.out.println("No Visitors");
				}
			}
		}else {
			System.out.println("No Visitors");
			UserInterfaceMethod.choosenOption();
		}

		int maxVisitorsNumber = visitorsToEvent[0];
		for(int j = 0 ; j < visitorsToEvent.length ; j++) {
			if(visitorsToEvent[j] > maxVisitorsNumber) {
				maxVisitorsNumber = visitorsToEvent[j];
			}
		}
				
		int flagForEquals = 0;
	    for(int equalIndex = 1; equalIndex < visitorsToEvent.length ; equalIndex++){   	
	            if(visitorsToEvent[0] != visitorsToEvent[equalIndex]){
	            	flagForEquals++;
	            	break;
	            }
	     }
	    
		if(maxVisitorsNumber == 0) {
			System.out.println("No Visitors");
		}
		else if(flagForEquals == 0) {
			System.out.println("All Events have " + visitorsToEvent[0] + " visitors" );
		}
		else {		
			for(int i = 0 ; i < allEventsCollection.size() ; i++) {
				if(allEventsCollection.get(i) != null && allEventsCollection.get(i).getNumberOfVisitorsToEvent() == maxVisitorsNumber) {
					allEventsCollection.get(i).render();
					allEventsCollection.get(i).listVisitors();	
				}
			}	
		}	    	
	}
	
	
	
	
	
}
