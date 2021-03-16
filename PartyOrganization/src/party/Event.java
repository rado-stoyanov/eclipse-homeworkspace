package party;

import java.util.ArrayList;

public class Event {
	
	public static final int MAX_VISITORS_TO_EVENT = 15;
	
	private int id;
	private String title;
	private boolean isAccessableForAll;
	private String day;	
	public ArrayList<Visitor> visitorsCollection = new ArrayList<Visitor>();
	private int visitorsToEvent;
	

	
	public Event (int id, String title, boolean isAccessableForAll, String day) {
		this.id = id;
		this.title = title;
		this.isAccessableForAll = isAccessableForAll;
		this.day = day;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setIsAccessableForAll(boolean isAccessableForAll) {
		this.isAccessableForAll = isAccessableForAll;
	}
	public boolean getIsAccessableForAll() {
		return this.isAccessableForAll;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return this.day;
	}
	
	public int getNumberOfVisitorsToEvent() {
		return this.visitorsToEvent;
	}
	
	
	/*Render Event*/
	public void render() {	
		if(this.isAccessableForAll == true) {
			System.out.printf("Event Number %d: %s : 6+ / %s\n", this.id, this.title, this.day);
		}
		if(this.isAccessableForAll == false) {
			System.out.printf("Event Number %d: %s : 18+ / %s\n", this.id, this.title, this.day);
		}	
	}
	
	public void filterRender() {	
		if(this.isAccessableForAll == true) {
			System.out.printf("*Event Number %d: %s : 6+ / %s\n", this.id, this.title, this.day);
		}
		if(this.isAccessableForAll == false) {
			System.out.printf("#Event Number %d: %s : 18+ / %s\n", this.id, this.title, this.day);
		}	
	}
	/*Add new Visitor*/
	public void addVisitor(Visitor visitorObject, boolean isAccessableForAll) {	
		
		if(this.visitorsToEvent == MAX_VISITORS_TO_EVENT) {
			System.out.println("The maximum number of visitors for this event has been reached");
		}else {
			if(visitorObject.getAge() >= 18) {
				this.visitorsCollection.add(visitorObject);
				this.visitorsToEvent++;
			}
			else if(visitorObject.getAge() < 18 && isAccessableForAll == true) {
				this.visitorsCollection.add(visitorObject);
				this.visitorsToEvent++;
			}
			else {
				System.out.println("The visitor is under age for this event!");
			}		
		}		
	}
	/*List Visitors*/
	public void listVisitors(String gender) {				
		for(int i = 0 ; i < this.visitorsCollection.size() ; i++) {		
			if(this.visitorsCollection.get(i) != null && this.visitorsCollection.get(i).getGender() == gender) {
				this.visitorsCollection.get(i).render();			
			}
		}			
	}
	public void listVisitors() {						
		for (Visitor object : this.visitorsCollection) {
			if(object != null) {
				object.render();
			}
		}			
	}
	/*Remove Visitors*/
	public void removeVisitor(int visitorIndex) {
		for(int i = 0 ; i < this.visitorsCollection.size() ; i++) {
			if(this.visitorsCollection.get(i) != null && this.visitorsCollection.get(i).getId() == visitorIndex) {
				this.visitorsCollection.remove(i);
			}
		}	
	}
	
	
	
	
	
	
}
	

	
	
	
	

