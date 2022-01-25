package ru.parpulova.school;

import ru.parpulova.school.stuff.Person;
import static java.lang.System.out;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Julia", "Parpulova");
		out.println(p1);
	}

}
