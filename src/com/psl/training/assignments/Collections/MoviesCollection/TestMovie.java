package com.psl.training.assignments.Collections.MoviesCollection;


import java.util.List;

public class TestMovie {
	public static void main(String[] args) {
		MovieService movieService=new MovieService();
		List<Movie> movieList=movieService.createMovieList();
		
		
		movieService.sortByLanguage(movieList);
		movieService.sortByDuration(movieList);
		movieService.sortByLanguageAndReleaseDate(movieList);
	}
}
