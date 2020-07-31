/*	@ author Nathan Stigler
 * 	@ date 7-29-2020
 * 	Period
 * 	Program Info
 */

package com.imperium.playground;

import java.util.ArrayList;
import java.util.List;

public class Playground {

	public static void main(String[] args) {

		String name = "Tom Cruise";
		String dob = "July 3, 1962";

		//height 5' 7" 1.7 m
		String height = "5' 7\" 1.7m"; 

		//List of Souses

		List <String> spouses = new ArrayList<String>();
		spouses.add("Katie Holmes");
		spouses.add("Nicole Kidman");
		spouses.add("Mimi Rogers");

		//List of upcoming films
		List <String> filmography = new ArrayList<String>();
		filmography.add("Mission Impossible 7 2021");
		filmography.add("Luna Park TBD");
		filmography.add("Untitle Tom Cruise/SpaceX Project TBD");
		filmography.add("Mission Impossible 8 2022");
		
		//Reported Salary
		List <String> salary = new ArrayList<String>();
		salary.add("Taps (1981)	$50,000");
		salary.add("Risky Business (1983) $50,000");
		salary.add("Legend (1985)	$500,000");
		salary.add("Top Gun (1986)	$2,000,000");

	}

}
