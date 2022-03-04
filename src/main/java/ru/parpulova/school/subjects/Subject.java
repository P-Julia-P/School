package ru.parpulova.school.subjects;

// 

public class Subject {
	public static final int DEFAULT_COURSE = 1;
	
	private int id;
	
	//  title, duration, course
	private String title;
	private int duration;
	private int course;
	
	
	public Subject(String title, int duration, int course) {
		setTitle(title);
		setDuration(duration);
		setCourse(course);
	}
	
	public Subject(String title, int duration) {
		this(title, duration, DEFAULT_COURSE);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		if (title == null || title.isBlank()) 
			throw new IllegalArgumentException("Title is empty");
		else 
			this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDuration(int duration) {
		if (duration > 0 && duration <= 120)
			this.duration = duration;
		else
			throw new IllegalArgumentException("Duration is out of range (0, 120]");
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setCourse(int course) {
		if(course >= 1 && course <= 5)
			this.course = course;
		else 
			throw new IllegalArgumentException("Неверный курс");
	}
	
	public int getCourse() {
		return course;
	}
	
	@Override
	public String toString() {
		return getTitle();
	}
}
