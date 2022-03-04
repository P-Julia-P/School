package ru.parpulova.school.db;

import java.util.List;

import ru.parpulova.school.subjects.Subject;


public interface Repository {
	
	List<Subject> getSubjects();
	
}
