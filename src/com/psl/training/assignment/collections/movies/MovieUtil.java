package com.psl.training.assignment.collections.movies;

import java.util.List;

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
