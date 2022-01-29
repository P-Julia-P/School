package ru.parpulova.school.stuff;

public class Teacher extends Person{
	
	public static final String EMAIL_REGEX = "((\\w+\\.\\w+)|\\w+)@((\\w+\\.\\w+)|\\w+)+"; 
	
	private String mail;
	
	public Teacher (String firstName, String lastName, String mail) {
		super(firstName,lastName);
		setMail(mail);
	}
	
	public void setMail(String mail) {
		if (mail.matches(EMAIL_REGEX))
			this.mail = mail;
		else
			throw new RuntimeException("Неверный e-mail.");
	}
	
	public String getMail() {
		return mail;
	}
	
	@Override
	public String toString() {
		return String.format("Teacher: %s, e-mail: %s", super.toString(), getMail());
	}
}
