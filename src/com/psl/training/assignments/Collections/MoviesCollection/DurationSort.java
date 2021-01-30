package com.psl.training.assignments.Collections.MoviesCollection;

import java.util.Comparator;

public class DurationSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
			Movie m1=(Movie) o1; 
			Movie m2=(Movie) o2; 
			
			if(m1.getDuration()<m2.getDuration())
				return -1;
			else if(m1.getDuration()>m2.getDuration())
					return 1;
		return 0;
	}

}
