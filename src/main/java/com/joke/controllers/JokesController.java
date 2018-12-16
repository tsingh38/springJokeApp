package com.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.joke.services.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
	
	private fetchJokeService fetchJokeService;
	
	JokesController(fetchJokeService fetchJokeService){
	this.fetchJokeService=fetchJokeService;
	}
		
	@RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", fetchJokeService.getRandomQuote());
        return "chucknorris";
    }
}
