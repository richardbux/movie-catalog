package com.richhunt.microservices.moviecatalogservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.richhunt.microservices.moviecatalogservice.model.MovieResponseInfo;

@FeignClient(name="movie.rating.service")
public interface MovieRatingService {
	
	@GetMapping("movie-rating/{userId}/{movieId}")
	public MovieResponseInfo getMovieRatingInfo(@PathVariable("userId") String userId,@PathVariable("movieId") String movieId);

}
