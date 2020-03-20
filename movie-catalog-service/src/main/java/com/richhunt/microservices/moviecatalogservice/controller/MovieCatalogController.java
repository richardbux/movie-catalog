package com.richhunt.microservices.moviecatalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.richhunt.microservices.moviecatalogservice.model.MovieResponseInfo;
import com.richhunt.microservices.moviecatalogservice.service.MovieInfoService;
import com.richhunt.microservices.moviecatalogservice.service.MovieRatingService;

@RestController
public class MovieCatalogController {

	@Autowired
	MovieInfoService movieInfoService;
	
	@Autowired
	MovieRatingService movieRatingService;
	
	
	@GetMapping("movie-catalog/{userId}/{movieId}")
	public ResponseEntity<MovieResponseInfo> getMovieExperience(@PathVariable("userId") String userId, @PathVariable("movieId") String movieId)
	{
		
		MovieResponseInfo movieResponseInfo=movieInfoService.getMovieInfo(movieId);
		
		MovieResponseInfo movieResponseInfo2=movieRatingService.getMovieRatingInfo(userId, movieId);
		
		System.out.println("Movie Rating : "+movieResponseInfo2);
		
		movieResponseInfo2.setMovieName(movieResponseInfo.getMovieName());
		
		movieResponseInfo2.setReleaseData(movieResponseInfo.getReleaseData());
		
		movieResponseInfo2.setCertificate(movieResponseInfo.getCertificate());
		
		return new ResponseEntity<MovieResponseInfo>(movieResponseInfo2,HttpStatus.OK);
		
	}
	
}
