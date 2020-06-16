package com.gmail.yuriypelykh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.gmail.yuriypelykh.exception.ParticipantsLimitException;

public class Group implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Student> list = new ArrayList<>();

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group(String name, List<Student> list) {
		super();
		this.name = name;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter student name:");
		String name = sc.nextLine();
		System.out.println("Enter student surname:");
		String surname = sc.nextLine();
		System.out.println("Enter gender (male, female):");
		String gender = sc.nextLine();
		System.out.println("Enter student age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter faculty:");
		String faculty = sc.nextLine();
		sc.close();
		return new Student(name, surname, gender, age, faculty);
	}

	public void addStudent(Student student) throws ParticipantsLimitException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}

		if (this.list.size() < 10) {
			this.list.add(student);
			student.setGroup(this.getName());
			System.out.println(
					"Student " + student.getName() + " " + student.getSurname() + " added to group " + this.getName());

		} else
			throw new ParticipantsLimitException();

	}

	public void rmStudent(Student student) {
		int removed = 0;
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i) != null && this.list.get(i).hashCode() == student.hashCode()
					&& this.list.get(i).equals(student)) {
				this.list.remove(i);
				System.out.println("Student " + student.getName() + " " + student.getSurname() + " removed from group "
						+ this.getName());
				removed = 1;
				break;
			}
		}
		if (removed == 0) {
			System.out.println("No such student in the group");
		}
	}

	public Student findStudent(String surname) {
		for (int i = 0; i < this.list.size(); i++) {
			if (surname.equals(this.list.get(i).getSurname())) {
				return this.list.get(i);
			}
		}
		return null;
	}

	public void sortBy(String by) {

		if (by.equalsIgnoreCase("name")) {
			this.list.sort(new StudentNameComparator());
		}
		if (by.equalsIgnoreCase("surname")) {
			this.list.sort(new StudentSurnameComparator());
		}
		if (by.equalsIgnoreCase("gender")) {
			this.list.sort(new StudentGenderComparator());
		}
		if (by.equalsIgnoreCase("age")) {
			this.list.sort(new StudentAgeComparator());
		}
	}

	public void writeToFile(File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < this.list.size(); i++) {
				pw.print(this.list.get(i).toString() + "\n");
			}
			System.out.println("Done!");
			System.out.println("Group list saved to " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Writting to file error!");
		}
	}

	public void writeToFile() {
		File file = new File("Group_" + this.name + ".csv");
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < this.list.size(); i++) {
				pw.print(this.list.get(i).toString() + "\n");
			}
			System.out.println("Done!");
			System.out.println("Group list saved to " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Writting to file error!");
		}
	}

	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < this.list.size(); i++) {
			string += this.list.get(i) + "\n";
		}
		return "\nGroup name: " + name + "\n\n" + string;
	}

	@Override
	protected Group clone() throws CloneNotSupportedException {
		return (Group) super.clone();
	}

}
