package com.psl.training.assignment.collections.movies;

import java.sql.Date;

public class Movie implements Comparable<Movie> {
	private String name;
	private String langauage;
	private Date releaseDate;
	private String director;
	private String producer;
	private int duration;

	public Movie(String name, String langauage, Date releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.langauage = langauage;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie: " + name + ", " + langauage + ", " + releaseDate + ", " + director + ", " + producer + ", "
				+ duration;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the langauage
	 */
	public String getLangauage() {
		return langauage;
	}

	/**
	 * @param langauage the langauage to set
	 */
	public void setLangauage(String langauage) {
		this.langauage = langauage;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Movie() {
		super();
	}

	@Override
	public int compareTo(Movie o) {
		return this.langauage.compareTo(o.langauage);
	}

}
