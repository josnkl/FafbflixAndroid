package com.zotmovies.fabflix.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	int id;
	String title;
	int year;
	String director;
	String banner_url;
	String trailer_url;

	// for XML
	List<Star> listOfStars;
	int directorId;
	String fid;
	
	List<Genre> listOfGenres;
	

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFid() {
		return fid;
	}

	public Movie() {
		id = -1;
		year = 0000;
		listOfStars = new ArrayList<Star>();
		directorId = -1;
		fid = "N/A";
		
		listOfGenres = new ArrayList<Genre>(); 
		director = "N/A";
	}

	public Movie(int id, String title, int year, String director, String banner_url, String trailer_url) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.director = director;
		this.banner_url = banner_url;
		this.trailer_url = trailer_url;
	}

	public void addStar(Star newStar) {
		listOfStars.add(newStar);
	}
	
	public void addGenre(Genre genre){
		listOfGenres.add(genre);
	}
	
	public List<Genre> getGenres(){
		return this.listOfGenres;
	}
	
	public void setGenres(List<Genre> genres){
		this.listOfGenres = genres; 
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + " year=" + year 
				+ " stars = " + listOfStars + " genres= " + listOfGenres +"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getBanner_url() {
		return banner_url;
	}

	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}

	public String getTrailer_url() {
		return trailer_url;
	}

	public void setTrailer_url(String trailer_url) {
		this.trailer_url = trailer_url;
	}

}
