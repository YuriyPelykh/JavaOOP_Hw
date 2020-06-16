package com.gmail.yuriypelykh;

public class Student extends Human {

	private String faculty;
	private String group;

	public Student(String name, String surname, int age, String faculty, String group) {
		super(name, surname, age);
		this.faculty = faculty;
		this.group = group;
	}

	public Student(String name, String surname, int age, String faculty) {
		super(name, surname, age);
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + faculty;
	}

}
