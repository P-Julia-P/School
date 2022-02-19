package ru.parpulova.school;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ru.parpulova.school.stuff.Teacher;

public class TeacherTest {
	
	@Test
	public void createTeacherTest() {
		new Teacher("A", "B", "teacher@test.com");
	}
	
	@Test
	public void invalidMailTest() {
		RuntimeException thrown = assertThrows(
				RuntimeException.class,
				() -> new Teacher("C", "D", "E"),
				"Expected Teacher ctor to throw, but it didn't"
		);
		assertTrue(thrown.getMessage().contains("Неверный e-mail."));
	}
	
	@Test
	public void teacherToStringTest() {
		Teacher t1 = new Teacher("F", "J", "teacher@test.com");
		assertEquals("Teacher: J F, e-mail: teacher@test.com", t1.toString());
	}
	

}
