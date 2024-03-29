package com.app.lokesh;

public class Course {
	
	private String courseName;
	private String instructor;
	private int durationInMonths;

	// Constructor
	public Course(String courseName, String instructor, int durationInMonths) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.durationInMonths = durationInMonths;
	}

	// Getters and setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
}