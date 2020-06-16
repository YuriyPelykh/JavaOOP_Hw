package com.gmail.yuriypelykh;

public class Cat {

	private String name;
	private String gender;
	private String color;
	private int age;
	private double weight;

	public Cat() {
		
	}
	
	public Cat(String name, String gender, String color, int age, double weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.age = age;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", gender=" + gender + ", color=" + color + ", age=" + age + ", weight=" + weight + "]";
	}

}
