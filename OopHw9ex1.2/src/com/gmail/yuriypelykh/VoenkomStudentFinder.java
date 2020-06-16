package com.gmail.yuriypelykh;

public class VoenkomStudentFinder implements Voenkom {

	@Override
	public Student[] findDraftee(Group group) {
		int counter = 0;
		for (int i = 0; i < group.getList().size(); i++) {
			if (group.getList().get(i) != null && group.getList().get(i).getGender().equals("male")
					&& group.getList().get(i).getAge() >= 18) {
				counter++;
			}
		}
		if (counter > 0) {
			Student[] draftee = new Student[counter];
			int k = 0;
			for (int i = 0; i < group.getList().size(); i++) {
				if (group.getList().get(i) != null && group.getList().get(i).getGender().equals("male")
						&& group.getList().get(i).getAge() >= 18) {
					draftee[k] = group.getList().get(i);
					k++;
				}
			}
			return draftee;
		}
		return null;
	}

}
