package com.app.lokesh.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.app.lokesh.Course;

public class CourseTest {

	@Test
	public void testCourse() {
		// Create a mock Course
		Course course = mock(Course.class);

		// Set up behavior for the mock
		when(course.getCourseName()).thenReturn("Java Programming");
		when(course.getInstructor()).thenReturn("John Smith");
		when(course.getDurationInMonths()).thenReturn(6);

		// Test methods that use the mocked behavior
		String courseName = course.getCourseName();
		String instructor = course.getInstructor();
		int durationInMonths = course.getDurationInMonths();

		// Verify the interactions
		verify(course).getCourseName();
		verify(course).getInstructor();
		verify(course).getDurationInMonths();

		// Assertions
		assert (courseName.equals("Java Programming"));
		assert (instructor.equals("John Smith"));
		assert (durationInMonths == 6);
	}
}