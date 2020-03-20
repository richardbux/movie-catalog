package com.richhunt.microservices.movieratingservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richhunt.microservices.movieratingservice.entity.MovieInfo;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long>{

	
		
}
