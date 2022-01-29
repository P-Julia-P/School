package ru.parpulova.school.stuff;

public class Student extends Person{
	private int course;

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
