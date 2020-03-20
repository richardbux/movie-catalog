package com.richhunt.microservices.movieratingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richhunt.microservices.movieratingservice.entity.MovieRatingInfo;

public interface MovieRatingRepository extends JpaRepository<MovieRatingInfo, Long>{

	
	MovieRatingInfo findByMovieIdAndUserId(Long movieId,Long userId);
	
}
