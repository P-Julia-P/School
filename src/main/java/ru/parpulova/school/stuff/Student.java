package ru.parpulova.school.stuff;

import java.util.ArrayList;
import java.util.List;

import ru.parpulova.school.subjects.StudentGrade;

public class Student extends Person{
	private int course;
	private List<StudentGrade> grades = new ArrayList<StudentGrade>();
	
	public List<StudentGrade> getGrades() {
		return grades;
	}

	public Student(String firstName, String lastName, int course) {
		super(firstName, lastName);
		setCourse(course);
	}
	
	public void setCourse(int course) {
		if(course >= 1 && course <= 5)
			this.course = course;
		else 
			throw new RuntimeException("Неверный курс");
	}
	
	public int getCourse() {
		return course;
	}
	
	@Override
	public String toString() {		
		return String.format("Student: %s, course: %d", super.toString(), getCourse());
	}
}
