package ru.parpulova.school.subjects;

import ru.parpulova.school.stuff.Student;

public class StudentGrade {
	private Student student;
	private Subject subject;
	private Grade grade;
	
	public StudentGrade (Student student, Subject subject, Grade grade) {
		
		setStudent(student);
		setSubject(subject);
		setGrade(grade);
		
		if(getStudent().getCourse() != getSubject().getCourse())
			throw new IllegalArgumentException("Student course != Subject course");
			
	}
	
	protected void setStudent(Student student) {
		if(student == null)
			throw new IllegalArgumentException("Student is null in StudentGrade");
		this.student = student;
		this.student.getGrades().add(this);
	}
	
	public Student getStudent() {
		return student;
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
		return getGrade().name();
	}
}
