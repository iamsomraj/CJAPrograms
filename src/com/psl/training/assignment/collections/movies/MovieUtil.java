package com.psl.training.assignment.collections.movies;

import java.util.List;

/**
 * Date 20.1.21 Java Assignments WAP to store the information of Movies in a
 * List which include name, language, releaseDate, director, producer, duration.
 * Use Comparable interface to sort the movies according to their language. Also
 * use Comparator interface to sort the movies according to the director.
 * 
 * Public List<Movie> createMovieList()
 * 
 * Public void sortByLanguage(List<Movie> movieList)
 * 
 * Public void sortByDuration(List<Movie> movieList)
 * 
 * Public void SortByLanguageAndReleaseDate(List<Movie> movieList) If language
 * is same then arrange by releasedate
 * 
 * @author Somraj Mukherjee
 *
 */
public class MovieUtil {

	public static void main(String[] args) {
		MovieService movieService = new MovieService();
		System.out.println("Created movie list: " + movieService.createMovieList());
		List<Movie> retrivedMovieList = movieService.getMovieList();
		System.out.println("\nSorting:\n");
		movieService.sortByLanguage(retrivedMovieList);
		movieService.sortByDuration(retrivedMovieList);
		movieService.SortByLanguageAndReleaseDate(retrivedMovieList);
	}

}
