package com.app.lokesh.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.app.lokesh.Student;

public class StudentTest {

	@Test
	public void testStudent() {
		// Create a mock Student
		Student student = mock(Student.class);

		// Set up behavior for the mock
		when(student.getName()).thenReturn("John Doe");
		when(student.getAge()).thenReturn(20);
		when(student.getStudentId()).thenReturn("12345");

		// Test methods that use the mocked behavior
		String name = student.getName();
		int age = student.getAge();
		String studentId = student.getStudentId();

		// Verify the interactions
		verify(student).getName();
		verify(student).getAge();
		verify(student).getStudentId();

		// Assertions
		assert (name.equals("John Doe"));
		assert (age == 20);
		assert (studentId.equals("12345"));
	}
}
