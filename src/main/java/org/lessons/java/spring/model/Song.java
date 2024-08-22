package org.lessons.java.spring.model;

public class Song {
	
	private Integer id;
	private String title;

	
	public Song(String title, Integer id) {
		this.id = id;
		this.title = title;

	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
