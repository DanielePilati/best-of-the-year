package org.lessons.java.spring.controller;

import java.util.ArrayList;

import org.lessons.java.spring.entities.Movie;
import org.lessons.java.spring.entities.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/bestofyear")
	public String bestofyear( Model model) {
		
		model.addAttribute("name", "Daniele Pilati");
		
		return "bestofyear";
	}
	
	@GetMapping("/movies")
	public String movies( Model model) {
		
		
		return "movies";
	}
	@GetMapping("/songs")
	public String songs( Model model) {
		
		
		return "songs";
	}
	
	
	
	private ArrayList<Movie> getBestMovies() {
		
		ArrayList<Movie> songList = new ArrayList<Movie>();
		songList.add(new Movie("Anger Games", 3));
		songList.add(new Movie("Avangers", 4));
		songList.add(new Movie("Il Padrino", 2));		
		songList.add(new Movie("Il Gladiatore", 5));
		songList.add(new Movie("Film sbagliato", 10));
	
		return new ArrayList<Movie>();
	}
	private ArrayList<Song> getBestSongs() {
		
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("Volare Oh Oh", 3));
		songList.add(new Song("O sole mio", 4));
		songList.add(new Song("Thriller", 2));		
		songList.add(new Song("Shine on you Crazy Dimond", 5));
		songList.add(new Song("Canzone sbagliata", 10));

		return new ArrayList<Song>();
	}

}
