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
		
		String text = "";
		for (Movie movie : getBestMovies()) {
			text += movie.getTitle() + ", ";
		}
		model.addAttribute("movieList", text);
		
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs( Model model) {
		
		String text = "";
		for (Song song : getBestSongs()) {
			text += song.getTitle() + ", ";
		}
		model.addAttribute("songList", text);
		
		return "songs";
	}
	
	@GetMapping("/itemlist")
	public String itemlist( Model model) {
			
		model.addAttribute("songList", getBestSongs());
		model.addAttribute("movieList", getBestMovies());
		
		return "itemlist";
	}
	
	
	private ArrayList<Movie> getBestMovies() {
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Anger Games", 3));
		movieList.add(new Movie("Avangers", 4));
		movieList.add(new Movie("Il Padrino", 2));		
		movieList.add(new Movie("Il Gladiatore", 5));
		movieList.add(new Movie("Film sbagliato", 10));
			
		return movieList;
	}
	private ArrayList<Song> getBestSongs() {
		
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("Volare Oh Oh", 3));
		songList.add(new Song("O sole mio", 4));
		songList.add(new Song("Thriller", 2));		
		songList.add(new Song("Shine on you Crazy Dimond", 5));
		songList.add(new Song("Canzone sbagliata", 10));

		return songList;
	}
	
	

}
