package ru.parpulova.school;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.Subject;

public class StudentGradeTest {
	@Test
	public void createStudentGrade() {
		Student s = new Student("A", "B", 3);
				
		s.addMark(new Subject("C", 10, 3), Grade.D);
		s.addMark(new Subject("D", 10, 3), Grade.F);
		
		Assertions.assertEquals(2, s.getMarks().size());
	}
	
	@Test
	public void createStudentGradeInvalidCourse() {
		RuntimeException thrown = assertThrows(
				RuntimeException.class,
				() -> new Student("A", "B", 3).addMark(
						new Subject("C", 10, 4), 
						Grade.D),
				"Expected StudentGrade ctor to throw, but it didn't"
		);
		assertTrue(thrown.getMessage().contains("Student course != Subject course"));
	}
}
