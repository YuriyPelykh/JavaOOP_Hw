package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Tom", "male", "Brown", 4, 4.0);
		Cat cat2 = new Cat("Trixy", "female", "Black", 3, 3.5);
		Cat cat3 = new Cat("Bob", "male", "White", 6, 12.0);

		Cat fatCat = mostFat(cat1, cat2, cat3);

		System.out.println("Most fat cat is " + fatCat.getName());
		System.out.println();
		System.out.println("Color: " + fatCat.getColor());
		System.out.println("Gender: " + fatCat.getGender());
		System.out.println("Weight: " + fatCat.getWeight() + " kg");
		System.out.println("Age : " + fatCat.getAge() + " year(s)");

	}

	public static Cat mostFat(Cat cat1, Cat cat2, Cat cat3) {
		Cat fatest = cat1;
		if (cat2.getWeight() > cat1.getWeight()) {
			fatest = cat2;
		}
		if (cat3.getWeight() > cat2.getWeight()) {
			fatest = cat3;
		}
		return fatest;
	}

}
