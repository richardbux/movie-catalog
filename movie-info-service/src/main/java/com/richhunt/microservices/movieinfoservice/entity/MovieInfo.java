package com.richhunt.microservices.movieinfoservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="movie_info")
public class MovieInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="release_date")
	private Date releaseData;
	
	@Column(name="certificate")
	private String certificate;
	
	@PrePersist
	public void beforeSaving()
	{
		setReleaseData(new Date());
	}
	
	@PreUpdate
	public void beforeUpdate()
	{
		setReleaseData(new Date());
	}

	public MovieInfo()
	{
		
	}
	
	public MovieInfo(Long movieId, String movieName, Date releaseData, String certificate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseData = releaseData;
		this.certificate = certificate;
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

	@Override
	public String toString() {
		return "MovieInfo [id=" + movieId + ", movieName=" + movieName + ", releaseData=" + releaseData + ", certificate="
				+ certificate + "]";
	}
	
	
	
	
}
