package org.lessons.java.spring.controller;

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
	

}
