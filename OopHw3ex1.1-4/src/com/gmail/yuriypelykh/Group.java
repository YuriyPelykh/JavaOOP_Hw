package com.gmail.yuriypelykh;

import java.util.Arrays;

import com.gmail.yuriypelykh.exception.ParticipantsLimitException;

public class Group {

	private String name;
	private Student[] group = new Student[10];

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group(String name, Student[] group) {
		super();
		this.name = name;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public void addStudent(Student student) throws ParticipantsLimitException {
		if(student == null) {
			throw new IllegalArgumentException("Null student");
		}
		
		int added = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				student.setGroup(this.getName());
				added = 1;
				System.out.println("Student " + student.getName() + " " + student.getSurname() + " added to group "
						+ this.getName());
				break;
			}
		}
		if (added == 0)
			throw new ParticipantsLimitException();
	}

	public void rmStudent(Student student) {
		int removed = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] == student) {
				group[i] = null;
				removed = 1;
				break;
			}
		}
		if (removed == 0) {
			System.out.println("No such student in the group");
		} else if (removed == 1) {
			System.out.println("Student " + student.getName() + " " + student.getSurname() + " removed from group "
					+ this.getName());
		}
	}

	public Student findStudent(String surname) {
		for (int i = 0; i < this.group.length; i++) {
			if (this.group[i] == null) {
				continue;
			}
			if (surname.equals(this.group[i].getSurname())) {
				return this.group[i];
			}
		}
		return null;
	}

//	public void sortGroup(Group group) {
//		boolean needIteration = true;
//		while (needIteration) {
//			needIteration = false;
//			for (int i = 0; i < this.group.length - 1; i++) {
//				if (this.group[i] == null && this.group[i + 1] != null) {
//					Student tmp = this.group[i];
//					this.group[i] = this.group[i + 1];
//					this.group[i + 1] = tmp;
//					needIteration = true;
//				} else if (this.group[i] == null && this.group[i + 1] == null
//						|| this.group[i] != null && this.group[i + 1] == null) {
//					continue;
//				} else if (this.group[i].getSurname().charAt(0) > this.group[i + 1].getSurname().charAt(0)) {
//					Student tmp = this.group[i];
//					this.group[i] = this.group[i + 1];
//					this.group[i + 1] = tmp;
//					needIteration = true;
//				}
//			}
//		}
//		String string = "";
//		for (int i = 0; i < this.group.length; i++) {
//			string += this.group[i] + "\n";
//		}
//		//return "Group name: " + name + "\n" + string;
//	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", group=" + Arrays.toString(group) + "]";
	}

}
