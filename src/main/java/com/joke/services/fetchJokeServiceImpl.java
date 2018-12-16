package com.joke.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.*;

@Service
public class fetchJokeServiceImpl implements fetchJokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	fetchJokeServiceImpl(){
		this.chuckNorrisQuotes=new ChuckNorrisQuotes();
	}
	@Override
	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
		
	}
}
