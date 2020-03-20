package com.richhunt.microservices.movieratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.richhunt.microservices.movieratingservice.dao.MovieInfoRepository;
import com.richhunt.microservices.movieratingservice.dao.MovieRatingRepository;
import com.richhunt.microservices.movieratingservice.dao.UserRepository;
import com.richhunt.microservices.movieratingservice.entity.MovieInfo;
import com.richhunt.microservices.movieratingservice.entity.MovieRatingInfo;
import com.richhunt.microservices.movieratingservice.entity.User;

@RestController
public class RatingServiceController {

	@Autowired
	MovieRatingRepository movieRatingRepo;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MovieInfoRepository movieInfoRepository;
	
	
	@GetMapping("movie-rating/{userId}/{movieId}")
	public ResponseEntity<MovieRatingInfo> getMovieRatingInfo(@PathVariable("userId") String userId,@PathVariable("movieId") String movieId)
	{
		MovieRatingInfo movieRatingInfo = movieRatingRepo.findByMovieIdAndUserId(Long.parseLong(movieId),Long.parseLong(userId));
		return new ResponseEntity<MovieRatingInfo>(movieRatingInfo,HttpStatus.OK);
	}
	
	@PostMapping("movie-rating/movie/")
	public ResponseEntity<String> addMovie(@RequestBody MovieInfo movie)
	{
		System.out.println("Movie : "+movie);
		movieInfoRepository.save(movie);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}
	
	@PostMapping("movie-rating/user/")
	public ResponseEntity<String> addUser(@RequestBody User user)
	{
		System.out.println("User : "+user);
		userRepository.save(user);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}

	
	@PostMapping("movie-rating/rating/")
	public ResponseEntity<String> addMovieRating(@RequestBody MovieRatingInfo movieRating)
	{
		System.out.println("Movie Rating : "+movieRating);
		movieRatingRepo.save(movieRating);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}
	
}
