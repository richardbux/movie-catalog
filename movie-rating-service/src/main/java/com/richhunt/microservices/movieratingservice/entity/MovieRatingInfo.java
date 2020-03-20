package com.richhunt.microservices.movieratingservice.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="movie_rating")
public class MovieRatingInfo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="rating")
	private Double rating; 
	
	@Column(name="user_id")
	private Long userId;

	@Column(name="movie_id")
	private Long movieId;

	public MovieRatingInfo()
	{
		
	}

	public MovieRatingInfo(Long id, String comment, Double rating, Long movieId, Long userId) {
		super();
		this.id = id;
		this.comment = comment;
		this.rating = rating;
		this.movieId = movieId;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}	
}
