package com.psl.training.assignment.collections.movies;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieService {
	private List<Movie> movieList;

	public List<Movie> createMovieList() {
		System.out.println("Creating the movie list: ");
		this.movieList = new ArrayList<Movie>();
		this.movieList.add(new Movie("abc", "bengali", Date.valueOf("2020-12-1"), "abc", "abc",
				(int) (Math.floor(Math.random() * 200) + 90)));
		this.movieList.add(new Movie("def", "bengali", Date.valueOf("2020-8-11"), "def", "def",
				(int) (Math.floor(Math.random() * 200) + 90)));
		this.movieList.add(new Movie("mno", "english", Date.valueOf("2020-2-18"), "mno", "mno",
				(int) (Math.floor(Math.random() * 200) + 81)));
		this.movieList.add(new Movie("pqrs", "marathi", Date.valueOf("2020-9-21"), "pqrs", "pqrs",
				(int) (Math.floor(Math.random() * 200) + 96)));
		this.movieList.add(new Movie("xyz", "hindi", Date.valueOf("2020-3-13"), "xyz", "xyz",
				(int) (Math.floor(Math.random() * 200) + 120)));
		return this.movieList;
	}

	/**
	 * @return the movieList
	 */
	public List<Movie> getMovieList() {
		return this.movieList;
	}

	/**
	 * @param movieList the movieList to set
	 */
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public void sortByLanguage(List<Movie> movieList) {
		System.out.println("Sorting by language: ");
		System.out.println("Sorting with the help of comparable: ");
		Collections.sort(movieList);
		System.out.println(movieList);
	}

	public void sortByDuration(List<Movie> movieList) {
		System.out.println("Sorting by duartion: ");
		System.out.println("Sorting with the help of comparator: ");
		Collections.sort(movieList, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getDuration() - o2.getDuration();
			}
		});
		System.out.println(movieList);
	}

	public void SortByLanguageAndReleaseDate(List<Movie> movieList) {
		System.out.println("Sorting by language and then by release date: ");
		System.out.println("Sorting with the help of comparator: ");
		Collections.sort(movieList, new Comparator<Movie>() {
			@Override
			public int compare(Movie o1, Movie o2) {
				int res = o1.getLangauage().compareTo(o2.getLangauage());
				if (res == 0) {
					return o1.getReleaseDate().compareTo(o2.getReleaseDate());
				}
				return res;
			}
		});
		System.out.println(movieList);
	}

}
