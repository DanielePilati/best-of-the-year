package org.lessons.java.spring.entities;

public class IDManager {
	
	private static int counterID = 0;
	
	public static int generateID() {
		
		IDManager.counterID++;
		
		 return IDManager.counterID;
	}
	
	public int getCounterID() {
		return IDManager.counterID;
	}
}
