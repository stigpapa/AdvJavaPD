package com.imperium.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.imperium.calc.Calc;
import com.imperium.model.Stars;

public class GetInfo {

	public static List<Stars> getInfo() {

		File file = new File("List of Stars");
		Scanner sc = null;


		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Create array list of stars
		List <Stars> stars = new ArrayList<Stars>();

		//Get info from Star Info file
		while(sc.hasNext()) {
			Stars s = new Stars();
			String header = sc.nextLine();

			//set the name of the star
			String tempName = sc.nextLine();
			String name = Calc.cleanName(tempName);
			s.setName(name);

			//set the dob of the star
			String tempDob = sc.nextLine();
			String dob = Calc.cleanDob(tempDob);
			s.setDob(dob);

			//set the height of the star
			String tempHeight = sc.nextLine();
			String height = Calc.cleanHeight(tempHeight);
			s.setHeight(height);

			//set the lists of spouses

			String spousesHeader = sc.nextLine();
			int count = 0;
			List <String> spouseList = new ArrayList<String>();
			while(count == 0) {
				String tempSpouse = sc.nextLine();
				if(tempSpouse.contains("List of Movies")) {
					count ++;
				}
				else {
					spouseList.add(Calc.cleanSpouse(tempSpouse));
				}

			}
			s.setSpouses(spouseList);

			//set the lists of movies
			count = 0;
			List <String> movies = new ArrayList<String>();
			while(count == 0) {
				String tempFilm = sc.nextLine();
				if(tempFilm.contains("Reported Salary")) {
					count ++;
				}
				else {
					movies.add(Calc.cleanFilm(tempFilm));
				}

			}
			s.setFilmography(movies);

			//set the lists of salaries
			count = 0;
			List <String> salary = new ArrayList<String>();
			while(count == 0) {
				String tempSalary = sc.nextLine();
				if(tempSalary.contains("End Record")) {
					count ++;
				}
				else {
					salary.add(Calc.cleanSalary(tempSalary));
				}

			}
			s.setSalary(salary);

			stars.add(s);
			
		}

		for(Stars s : stars) {
			
			System.out.print(s.getCount() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getDob() + "\t");
			System.out.print(s.getHeight() + "\t");
			System.out.print(s.getSpouses() + "\t");
			
			System.out.print(s.getFilmography() + "\t");
			System.out.println(s.getSalary());
			
		}
		
		return stars;
		
	}

}
