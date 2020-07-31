package com.imperium.calc;

import java.io.FileNotFoundException;

public class Calc {

	public static void main(String[] args) {





	}

	public static String cleanName(String name) {

		String temp = name.substring(6);
		return temp;

	}

	public static String cleanDob(String dob) {

		String temp = dob.substring(6, dob.indexOf(" in"));

		return temp;

	}

	public static String cleanHeight(String height) {


		int num1 = height.indexOf('(');
		int num2 = height.indexOf(')');
		String temp = height.substring(num1+1,num2-1);
		return temp;
	}

	public static String cleanSpouse(String spouse) {


		if(spouse.contentEquals("Not Married")) {
			return spouse;
		}else {

			int num1 = spouse.indexOf(",");
			String temp = spouse.substring(0,num1);
			return temp;
		}


	}

	public static String cleanFilm(String film) {

		String temp = film.substring(0, film.indexOf("Date"));

		return temp.trim();

	}

	public static String cleanSalary(String salary) {

		int num = salary.indexOf("$");
		if(num != -1) {
			salary = salary.substring(num);
		}
			return salary;
		
	}


}



