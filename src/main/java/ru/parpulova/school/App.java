package ru.parpulova.school;

import ru.parpulova.school.stuff.Person;
import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.stuff.Teacher;
import ru.parpulova.school.subjects.Subject;

import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Julia", "Parpulova");
		out.println(p1);
		
		Person p2 = new Student("Ann", "Smith", 1);
		out.println(p2);
		
		Teacher p3 = new Teacher("Ben", "Andersen", "bn@gmail.com");
		out.println(p3);
		p3.getSubjects().add(new Subject("Math", 102, 2));
		p3.getSubjects().add(new Subject("Phisics", 95, 3));
		for (Subject s: p3.getSubjects()) 
			out.printf("\t%s\n",s);
		
	}

}
