package com.gmail.yuriypelykh;

public class Human {

	private String name;
	private String surname;
	private String gender;
	private int age;
	
	public Human(String name, String surname, String gender, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return surname + " " + name + ", " + gender + ", Age " + age;
	}

}
