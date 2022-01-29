package ru.parpulova.school;

import ru.parpulova.school.stuff.Person;
import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.stuff.Teacher;

import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Julia", "Parpulova");
		out.println(p1);
		
		Person p2 = new Student("Ann", "Smith", 1);
		out.println(p2);
		
		Person p3 = new Teacher("Ben", "Andersen", "bn@gmail.com");
		out.println(p3);
		
	}

}
