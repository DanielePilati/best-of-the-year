package org.lessons.java.spring.model;

public class Movie {
	
	private Integer id;
	private String title;
	
	public Movie(String title, Integer id) {
		this.id = id;
		this.title = title;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Integer getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
