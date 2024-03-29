package com.app.lokesh;

public class University {
	
	private String name;
	private String location;
	private int numberOfStudents;

	// Constructor
	public University(String name, String location, int numberOfStudents) {
		this.name = name;
		this.location = location;
		this.numberOfStudents = numberOfStudents;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
}