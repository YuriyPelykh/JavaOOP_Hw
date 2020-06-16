package com.gmail.yuriypelykh;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Human implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(faculty, group);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(faculty, other.faculty) && Objects.equals(group, other.group);
	}

	@Override
	public String toString() {
		return super.toString() + "; " + faculty;
	}

}
