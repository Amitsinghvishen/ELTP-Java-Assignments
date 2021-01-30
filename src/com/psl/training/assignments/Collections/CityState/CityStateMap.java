package com.psl.training.assignments.Collections.CityState;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class CityStateMap {
	public static void main(String args[]) throws FileNotFoundException {
		HashMap<String,String> map=new HashMap<>();
		File file=new File("C:\\Users\\Amit\\eclipse-workspace\\ELTP Java Assignments\\src\\com\\psl\\training\\assignments\\Collections\\CityState\\city.txt");
		Scanner s=new Scanner(file);
		while(s.hasNext()) {
			String line=s.nextLine();
			String[] str=line.split("=");
			map.put(str[0],str[1]);
		}
		
		//Get all cities
		System.out.println("All cities");
		Set<String> city=map.keySet();
		System.out.println(city);
		
		//Get all States
		System.out.println("All States");
		Set<String> states=new HashSet<>();
		for(String key:city) {
			states.add(map.get(key));
		}
		System.out.println(states);
		
		//Get cities for a state
		Set<String> citiesForState=new HashSet<>();
		for(String key:city) {
			String temp=map.get(key);
			if(temp.equals("Madhya Pradesh"))
				citiesForState.add(key);
		}
		System.out.println("cities for Madhya Pradesh state");
		System.out.println(citiesForState);
		
		// Add new city state pair
		map.put("Ballia", "Uttar Pradesh");
		
		//Delete all the cities for a given state 
		
		System.out.println("Map after deletion");
		Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry=iterator.next();
			if(entry.getValue().equals("Madhya Pradesh")) {
				iterator.remove();
			}
		}
		
		System.out.println(map);
		
	}
}
