package com.psl.training.assignments.Collections.MoviesCollection;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
	List<Movie> movieList=new ArrayList<>();
	public MovieService() {
		movieList.add(new Movie("The Shawshank Redemption","English","1995-02-17","Frank Darabont","Niki Marvin",144));
		movieList.add(new Movie("The Godfather","English","1972-08-24"," Francis Ford Coppola","Albert S. Ruddy",178));
		movieList.add(new Movie("Deadpool 2","English","2018-05-15","David Leitch","Ryan Reynolds",119));
		movieList.add(new Movie("3 Idiots","Hindi","2009-12-25","Rajkumar Hirani","Vinod Chopra Films",171));
		movieList.add(new Movie("Raw","French","2017-03-25","Julia Ducournau","Jean de Forêts",109));
		
	}
	
	public List<Movie> createMovieList(){
		return this.movieList;
	}

	public void sortByLanguage(List<Movie> movieList) {
		System.out.println("----Sorting movies by language----\n");
		movieList.sort(null);
		for(Movie m:movieList) {
			System.out.println(m);
		}
	}
	
	
}
