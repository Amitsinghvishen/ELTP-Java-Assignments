package com.psl.training.assignments.Collections.MoviesCollection;

import java.util.Comparator;

public class LanguageAndReleasedateSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Movie m1=(Movie) o1;
		Movie m2=(Movie) o2;
		if(m1.getLanguage().compareTo(m2.getLanguage())==-1) {
			return -1;
		}
		else if(m1.getLanguage().compareTo(m2.getLanguage())==1) {
			return 1;
		}
		else {
			return m1.getReleaseDate().compareTo(m2.getReleaseDate());
		}
		
	}

}
