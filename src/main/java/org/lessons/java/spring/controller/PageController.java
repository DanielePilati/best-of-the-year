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
		
	@GetMapping("/")
	public String bestofyear( Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("name", "Daniele Pilati");
		model.addAttribute("image", "/img/film-img.gif");
		model.addAttribute("h1", "Best of By");
		model.addAttribute("type", "show-details");
		
		return "main-model";
	}
	
	@GetMapping("/movies")
	public String movies( Model model) {
		model.addAttribute("list", getBestMovies());
		model.addAttribute("title", "Movies");
		model.addAttribute("h1", "Best Movies");
		model.addAttribute("type", "generate-list");
		return "main-model";
	}
	
	@GetMapping("/songs")
	public String songs( Model model) {
		model.addAttribute("list", getBestSongs());
		model.addAttribute("title", "Songs");
		model.addAttribute("h1", "Best Songs");
		model.addAttribute("type", "generate-list");
		return "main-model";
	}
	
	@GetMapping("/songs/{id}")
	public String song(Model model, @PathVariable("id") Integer movieId) {
		String title = null;
		for(Song song : getBestSongs()) {
			if(movieId.equals(song.getId())) {
				title = song.getTitle();
			}
		}
		model.addAttribute("title", "Your Song");
		model.addAttribute("name", title);
		model.addAttribute("image", "/img/film-img.gif");
		model.addAttribute("h1", "Your Song is");
		model.addAttribute("type", "show-details");
		return "main-model"; 																				
	}
	
	@GetMapping("/movies/{id}")
	public String movie(Model model, @PathVariable("id") Integer songId) {
		String title = null;
		for(Movie movie : getBestMovies()) {
			if(songId.equals(movie.getId())) {
				title = movie.getTitle();
			}
		}
		model.addAttribute("title", "Your Movie");
		model.addAttribute("name", title);
		model.addAttribute("image", "/img/film-img.gif");
		model.addAttribute("h1", "Your Movie  is");
		model.addAttribute("type", "show-details");
		return "main-model";																				
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
