package ru.parpulova.school.stuff;

public class Teacher extends Person{
	private String mail;
	
	public Teacher (String firstName, String lastName, String mail) {
		super(firstName,lastName);
		setMail(mail);
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	
	@Override
	public String toString() {
		return String.format("Teacher: %s, e-mail: %s ", super.toString(), getMail());
	}
}
