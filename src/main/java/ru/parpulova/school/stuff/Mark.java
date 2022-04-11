package ru.parpulova.school.stuff;

import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.Subject;

public class Mark {
	private Subject subject;
	private Grade grade;
	private Student student;
	
	Mark (Student student, Subject subject, Grade grade) {
		
		setSubject(subject);
		setGrade(grade);
		this.student = student;
		
		if(getStudent().getCourse() != getSubject().getCourse())
			throw new IllegalArgumentException("Student course != Subject course");
			
	}
	
	public Student getStudent() {
		return this.student;
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