package ru.parpulova.school.stuff;

import java.util.ArrayList;
import java.util.List;

import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.Subject;

public class Student extends Person{
	private int course;
	private List<Mark> marks = new ArrayList<Mark>();
	
	public List<Mark> getMarks() {
		return marks;
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
	
	public Mark addMark(Subject subject, Grade grade) {
		Mark mark = new Mark(subject, grade);
		this.getMarks().add(mark);
		return mark;
	}
	
	@Override
	public String toString() {		
		return String.format("Student: %s, course: %d", super.toString(), getCourse());
	}
	
	public class Mark {
		private Subject subject;
		private Grade grade;
		
		private Mark (Subject subject, Grade grade) {
			
			setSubject(subject);
			setGrade(grade);
			
			if(getStudent().getCourse() != getSubject().getCourse())
				throw new IllegalArgumentException("Student course != Subject course");
				
		}
		
		public Student getStudent() {
			return Student.this;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			if(subject == null) 
				throw new IllegalArgumentException("Subject is null in StudentGrade");
			this.subject = subject;
		}

		public Grade getGrade() {
			return grade;
		}

		public void setGrade(Grade grade) {
			this.grade = grade;
		}
		
		@Override
		public String toString() {
			return String.format("%s - %s", getSubject() ,getGrade().name());
		}
	}
}
