package com.gmail.yuriypelykh;

import com.gmail.yuriypelykh.exception.ParticipantsLimitException;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Ivan", "Skliar", 18, "ITS");
		Student student2 = new Student("Petro", "Chan", 18, "ITS");
		Student student3 = new Student("Hanna", "Stallone", 18, "ITS");
		Student student4 = new Student("Alla", "Ivanenko", 18, "ITS");
		Student student5 = new Student("Sergii", "Iarmola", 18, "ITS");
		Student student6 = new Student("Dmytro", "Skliar", 18, "ITS");
		Student student7 = new Student("Vasyl", "Vovk", 18, "ITS");
		Student student8 = new Student("Olga", "Lepeha", 18, "ITS");
		Student student9 = new Student("Galyna", "Blanka", 18, "ITS");
		Student student10 = new Student("Maryna", "Vilaribo", 18, "ITS");
		Student student11 = new Student("Daryna", "Bilabadzho", 18, "ITS");

		Group ts62 = new Group("TS-62");

		try {
			ts62.addStudent(student1);
			ts62.addStudent(student2);
			ts62.addStudent(student3);
			ts62.addStudent(student4);
			ts62.addStudent(student5);
			ts62.addStudent(student6);
			ts62.addStudent(student7);
			ts62.addStudent(student8);
			ts62.addStudent(student9);
			ts62.addStudent(student10);
			ts62.addStudent(student11);

		} catch (ParticipantsLimitException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(ts62.toString());

		ts62.rmStudent(student3);

		System.out.println(ts62.findStudent("Blanka"));

		System.out.println(ts62.toString());

	}

}
