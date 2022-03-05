package ru.parpulova.school.db;

import java.io.Closeable;
import java.util.List;

import ru.parpulova.school.subjects.Subject;


public interface Repository extends Closeable {
	
	List<Subject> getSubjects();
	
}
