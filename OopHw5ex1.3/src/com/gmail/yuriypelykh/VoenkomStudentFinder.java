package com.gmail.yuriypelykh;

public class VoenkomStudentFinder implements Voenkom {

	@Override
	public Student[] findDraftee(Group group) {
		int counter = 0;
		for (int i = 0; i < group.getList().length; i++) {
			if (group.getList()[i] != null && group.getList()[i].getGender().equals("male")
					&& group.getList()[i].getAge() >= 18) {
				counter++;
			}
		}
		if (counter > 0) {
			Student[] draftee = new Student[counter];
			int k = 0;
			for (int i = 0; i < group.getList().length; i++) {
				if (group.getList()[i] != null && group.getList()[i].getGender().equals("male")
						&& group.getList()[i].getAge() >= 18) {
					draftee[k] = group.getList()[i];
					k++;
				}
			}
			return draftee;
		}
		return null;
	}

}
