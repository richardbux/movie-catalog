package com.richhunt.microservices.moviecatalogservice.model;

public class MovieRequestInfo {

	private Long userId;
	
	private Long movieId;

	public MovieRequestInfo(Long userId, Long movieId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "MovieRequestInfo [userId=" + userId + ", movieId=" + movieId + "]";
	}
}
