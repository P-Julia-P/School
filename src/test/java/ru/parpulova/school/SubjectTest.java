package ru.parpulova.school;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ru.parpulova.school.subjects.Subject;

public class SubjectTest {
	
	@Test
	public void createSubjectTest() {
		new Subject ("A", 10, 2);
	}
	
	@Test
	public void emptyTitleTest() {
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject("", 10, 2),
				"Expected Subject ctor to throw, but it didn't, for ''"
		);
		assertTrue(thrown.getMessage().contains("Title is empty"));
		
		IllegalArgumentException thrown1 = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject("  ", 10, 2),
				"Expected Subject ctor to throw, but it didn't, for '   '"
		);
		assertTrue(thrown1.getMessage().contains("Title is empty"));
		
		IllegalArgumentException thrown2 = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject(null, 10, 2),
				"Expected Subject ctor to throw, but it didn't, for null"
		);
		assertTrue(thrown2.getMessage().contains("Title is empty"));
	}
	
	@Test
	public void durationRangeTest() {
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject("A", 1000, 2),
				"Subject duration invalid (too high)"
		);
		assertTrue(thrown.getMessage().contains("Duration is out of range"));
		
		IllegalArgumentException thrown1 = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject("A", -1, 2),
				"Subject duration invalid (too low)"
		);
		assertTrue(thrown1.getMessage().contains("Duration is out of range"));
	}
	
	@Test
	public void invalidCourseTest() {
		IllegalArgumentException thrown = assertThrows(
				IllegalArgumentException.class,
				() -> new Subject("A", 100, 10),
				"Expected Student ctor to throw, but it didn't"
		);
		assertTrue(thrown.getMessage().contains("Неверный курс"));
	}
	
	@Test
	public void subjectToStringTest() {
		Subject s1 = new Subject("A", 115, 3);
		assertEquals("A", s1.toString());
	}
	
}
