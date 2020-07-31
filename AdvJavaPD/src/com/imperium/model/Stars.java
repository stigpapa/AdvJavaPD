package com.imperium.model;

import java.util.List;

public class Stars {
	static int counter = 0;
	
	int count;
	String name;
	String dob;
	String height;
	
	List<String> spouses;
	List<String> filmography;
	List<String> salary;
	
	public Stars() {
		this.count = counter++;
		
	}
	
	
	public int getCounter() {
		return counter;
	}


	public int getCount() {
		return count;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public List<String> getSpouses() {
		return spouses;
	}
	public void setSpouses(List<String> spouses) {
		this.spouses = spouses;
	}
	public List<String> getFilmography() {
		return filmography;
	}
	public void setFilmography(List<String> filmography) {
		this.filmography = filmography;
	}
	public List<String> getSalary() {
		return salary;
	}
	public void setSalary(List<String> salary) {
		this.salary = salary;
	}
	
	
	
	
}
