package org.lessons.java.spring.entities;

public class Song {
	
	private int id;
	private String title;
	private float vote;
	
	public Song(String title, float vote) {
		this.id = IDManager.generateID();
		this.title = title;
		this.setVote(vote);
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
	
	public float getVote() {
		return this.vote;
	}
	
	public void setVote(float vote) {
		if (vote >= 0 && vote <= 5) {
			this.vote = vote;
		} else {
			this.vote = 0;
			System.out.println("voto non valido");
		}
	}
	
	
}
