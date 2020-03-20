package com.richhunt.microservices.moviecatalogservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.richhunt.microservices.moviecatalogservice.model.MovieResponseInfo;

@FeignClient(name="movie.info.service")
public interface MovieInfoService {

	@GetMapping(value = "/movie/info/{movieId}")
	public MovieResponseInfo getMovieInfo(@PathVariable("movieId") String movieId);
	
}
