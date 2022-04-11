package ru.parpulova.school;

import ru.parpulova.school.db.Repository;
import ru.parpulova.school.db.SQLiteRepository;
import ru.parpulova.school.stuff.Person;
import ru.parpulova.school.stuff.Student;
import ru.parpulova.school.stuff.Teacher;
import ru.parpulova.school.subjects.Grade;
import ru.parpulova.school.subjects.Subject;

import static java.lang.System.out;

import java.io.IOException;

public class App {

	public static void printMarks(Student s) {
		out.println(s.toString());
		for(var m : s.getMarks()) {
			out.printf("\t%s\n", m);
		}
	}
	
	public static void main(String[] args) throws IOException {
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
		
/*		
		try (Repository db = new SQLiteRepository()) {
			for(Subject s : db.getSubjects()) {
				out.printf("%-3d %-20s %-4d %-3d\n", s.getId(), s.getTitle(), s.getDuration(), s.getCourse());
			}
		} // db.close
		
		
		try (Repository db = new SQLiteRepository()) {
			Subject s = db.getSubject(2);
//			out.println(s);
			if(s != null) {
				db.delete(s);
			}
		}*/
		
	}

}
