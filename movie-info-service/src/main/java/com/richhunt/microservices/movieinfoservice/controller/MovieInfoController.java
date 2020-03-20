package com.richhunt.microservices.movieinfoservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.richhunt.microservices.movieinfoservice.entity.MovieInfo;
import com.richhunt.microservices.movieinfoservice.service.MovieInfoRepository;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoRepository movieInfoRepo;
	
	@GetMapping("/movie/info/{movieId}")
	public ResponseEntity<MovieInfo> getMovieInfo(@PathVariable("movieId") String movieId)
	{
		Optional<MovieInfo> movieInfo = movieInfoRepo.findById(Long.parseLong(movieId));
		return new ResponseEntity<MovieInfo>(movieInfo.get(),HttpStatus.OK);
	}
}
