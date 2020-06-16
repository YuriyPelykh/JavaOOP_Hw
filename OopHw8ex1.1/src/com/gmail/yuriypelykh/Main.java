package com.gmail.yuriypelykh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.gmail.yuriypelykh.exception.ParticipantsLimitException;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Ivan", "Skliar", "male", 17, "ITS");
		Student student2 = new Student("Petro", "Chan", "male", 18, "ITS");
		Student student3 = new Student("Hanna", "Stallone", "female", 18, "ITS");
		Student student4 = new Student("Alla", "Ivanenko", "female", 18, "ITS");
		Student student5 = new Student("Sergii", "Iarmola", "male", 18, "ITS");
		Student student6 = new Student("Dmytro", "Skliar", "male", 17, "ITS");
		Student student7 = new Student("Vasyl", "Vovk", "male", 19, "ITS");
		Student student8 = new Student("Olga", "Vovk", "female", 18, "ITS");
		Student student9 = new Student("Galyna", "Blanka", "female", 19, "ITS");
		Student student10 = new Student("Maryna", "Vilaribo", "female", 18, "ITS");
		Student student11 = new Student("Gnat", "Bilabadzho", "male", 17, "ITS");

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

		ts62.rmStudent(student3);

		ts62.rmStudent(ts62.findStudent("Iarmola"));

		try {
			ts62.addStudent(ts62.inputStudent());
		} catch (ParticipantsLimitException e) {
			System.out.println(e.getMessage());
		}

		ts62.sortBy("name");
		ts62.sortBy("surname");

		System.out.println(ts62.toString());

		Voenkom goToArmyNow = new VoenkomStudentFinder();
		System.out.println(goToArmyNow.toString(goToArmyNow.findDraftee(ts62)));

		ts62.writeToFile();

		// ------- Serialization: ----------

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("group.db"))) {
			oos.writeObject(ts62);
			System.out.println("\nGroup exported to ./group.db file");
		} catch (IOException e) {
			System.out.println("Error saving group!");
		}
		
		Group importedGroup = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("group.db"))) {
			importedGroup = (Group) ois.readObject();
			System.out.println();
			System.out.println("Group imported from ./group.db file");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading group!");
		}
		
		System.out.println("\n\nImported: \n" + importedGroup.toString());

	}

}
