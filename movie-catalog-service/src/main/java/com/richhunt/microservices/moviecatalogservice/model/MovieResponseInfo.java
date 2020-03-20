package com.richhunt.microservices.moviecatalogservice.model;

import java.util.Date;

public class MovieResponseInfo {

	private Long userId;
	
	private Long movieId;
	
	private String movieName;
	
	private Date releaseData;
	
	private String certificate;
	
	private Double rating;
	
	private String comment;

	public MovieResponseInfo()
	{
		
	}
	
	public MovieResponseInfo(Long userId, Long movieId, String movieName, Date releaseData, String certificate,
			Double rating, String comment) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseData = releaseData;
		this.certificate = certificate;
		this.rating = rating;
		this.comment = comment;
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

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getReleaseData() {
		return releaseData;
	}

	public void setReleaseData(Date releaseData) {
		this.releaseData = releaseData;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "MovieResponseInfo [userId=" + userId + ", movieId=" + movieId + ", movieName=" + movieName
				+ ", releaseData=" + releaseData + ", certificate=" + certificate + ", rating=" + rating + ", comment="
				+ comment + "]";
	}
	
}
