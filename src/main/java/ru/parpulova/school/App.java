package ru.parpulova.school;

import ru.parpulova.school.stuff.Person;
import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.stuff.Teacher;
import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.Subject;

import static java.lang.System.out;

public class App {

	public static void printMarks(Student s) {
		out.println(s.toString());
		for(var m : s.getMarks()) {
			out.printf("\t%s\n", m);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Julia", "Parpulova");
		out.println(p1);
		
		
		
		Teacher p3 = new Teacher("Ben", "Andersen", "bn@gmail.com");
		out.println(p3);
		p3.getSubjects().add(new Subject("Math", 102, 1));
		p3.getSubjects().add(new Subject("Phisics", 95, 1));
		for (Subject s: p3.getSubjects()) 
			out.printf("\t%s\n",s);
		
		Student p2 = new Student("Ann", "Smith", 1);
//		out.println(p2);
		p2.addMark(p3.getSubjects().get(0), Grade.C);
		p2.addMark(p3.getSubjects().get(1), Grade.B);
		
		printMarks(p2);
		
	}

}
