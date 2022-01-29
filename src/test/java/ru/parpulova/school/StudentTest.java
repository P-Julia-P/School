package ru.parpulova.school;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ru.parpulova.school.stuff.Student;

public class StudentTest {
	
	@Test
	public void createStudentTest() {
		new Student("A", "B", 3);
	}
	
	@Test
	public void invalidCourseTest() {
		RuntimeException thrown = assertThrows(
		           RuntimeException.class,
		           () -> new Student("C", "D", 7),
		           "Expected Student ctor to throw, but it didn't"
		    );

		    assertTrue(thrown.getMessage().contains("Неверный курс"));
	}

	@Test
	public void studentToStringTest() {
		Student s1 = new Student("E", "F", 2); //Student: F E, 2
		
		assertEquals("Student: F E, course: 2", s1.toString() );
	}

}
