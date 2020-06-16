package com.gmail.yuriypelykh;

public class Student extends Human {

	private String faculty;
	private String group;

	public Student(String name, String surname, String gender, int age, String faculty, String group) {
		super(name, surname, gender, age);
		this.faculty = faculty;
		this.group = group;
	}

	public Student(String name, String surname, String gender, int age, String faculty) {
		super(name, surname, gender, age);
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

	public boolean equals(Student obj) {
		if (this.getFaculty().equals(obj.getFaculty()) && this.getGroup().equals(obj.getGroup())
				&& this.getAge() == obj.getAge() && this.getGender().equals(obj.getGender())
				&& this.getName().equals(obj.getName()) && this.getSurname().equals(obj.getSurname())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + faculty;
	}

}
