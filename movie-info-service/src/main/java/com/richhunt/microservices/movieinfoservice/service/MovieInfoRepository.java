package com.richhunt.microservices.movieinfoservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richhunt.microservices.movieinfoservice.entity.MovieInfo;

public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long>{

	
}
