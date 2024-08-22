package org.lessons.java.spring.controller;

import java.util.ArrayList;

import org.lessons.java.spring.model.Movie;
import org.lessons.java.spring.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
		
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
		model.addAttribute("list", text);
		model.addAttribute("title", "Movies");
		return "title-list";
	}
	
	@GetMapping("/songs")
	public String songs( Model model) {
		
		String text = "";
		for (Song song : getBestSongs()) {
			text += song.getTitle() + ", ";
		}
		model.addAttribute("list", text);
		model.addAttribute("title", "Songs");
		return "title-list";
	}
	
	@GetMapping("/songs/{id}")
	public String song(Model model, @PathVariable("id") Integer movieId) {
		String title = null;
		for(Movie movie : getBestMovies()) {
			if(movieId.equals(movie.getId())) {
				title = movie.getTitle();
			}
		}
		model.addAttribute("title", "Your Song");
		model.addAttribute("name", title);
		return "your-title"; 																				
	}
	
	@GetMapping("/movies/{id}")
	public String movie(Model model, @PathVariable("id") Integer songId) {
		String title = null;
		for(Song song : getBestSongs()) {
			if(songId.equals(song.getId())) {
				title = song.getTitle();
			}
		}
		model.addAttribute("title", "Your Song");
		model.addAttribute("name", title);
		return "your-title";																				
	}
		
	
	private ArrayList<Movie> getBestMovies() {
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Anger Games", 0));
		movieList.add(new Movie("Avangers", 1));
		movieList.add(new Movie("Il Padrino", 2));		
		movieList.add(new Movie("Il Gladiatore", 3));
		movieList.add(new Movie("Film sbagliato", 4));
			
		return movieList;
	}
	private ArrayList<Song> getBestSongs() {
		
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("Volare Oh Oh", 0));
		songList.add(new Song("O sole mio", 1));
		songList.add(new Song("Thriller", 2));		
		songList.add(new Song("Shine on you Crazy Dimond", 3));
		songList.add(new Song("Canzone sbagliata", 4));

		return songList;
	}
	
	

}
