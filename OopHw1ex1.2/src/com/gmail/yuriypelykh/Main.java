package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(3, 4, 5);
		Triangle triangle2 = new Triangle(8, 5, 7);

		System.out.println("Triangle 1 area equals to: " + triangle1.calcArea() + " cm^2");
		System.out.println("Triangle 2 area equals to: " + triangle2.calcArea() + " cm^2");

	}

}
