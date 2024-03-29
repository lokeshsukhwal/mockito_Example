package com.app.lokesh.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.app.lokesh.University;

public class UniversityTest {

	@Test
	public void testUniversity() {
		// Create a mock University
		University university = mock(University.class);

		// Set up behavior for the mock
		when(university.getName()).thenReturn("Mock University");
		when(university.getLocation()).thenReturn("Mock Location");
		when(university.getNumberOfStudents()).thenReturn(1000);

		// Test methods that use the mocked behavior
		String name = university.getName();
		String location = university.getLocation();
		int numberOfStudents = university.getNumberOfStudents();

		// Verify the interactions
		verify(university).getName();
		verify(university).getLocation();
		verify(university).getNumberOfStudents();

		// Assertions
		assert (name.equals("Mock University"));
		assert (location.equals("Mock Location"));
		assert (numberOfStudents == 1000);
	}
}
