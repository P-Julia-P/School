package ru.parpulova.school;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.StudentGrade;
import ru.parpulova.school.subjects.Subject;

public class StudentGradeTest {
	@Test
	public void createStudentGrade() {
		new StudentGrade(
				new Student("A", "B", 3), 
				new Subject("C", 10, 3), Grade.D);
	}
	
	@Test
	public void createStudentGradeInvalidCourse() {
		RuntimeException thrown = assertThrows(
				RuntimeException.class,
				() -> new StudentGrade(
						new Student("A", "B", 3), 
						new Subject("C", 10, 4), 
						Grade.D),
				"Expected StudentGrade ctor to throw, but it didn't"
		);
		assertTrue(thrown.getMessage().contains("Student course != Subject course"));
	}
}
