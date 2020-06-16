package com.gmail.yuriypelykh;

public interface Voenkom {
	
	public Student[] findDraftee(Group group);
	
	public default String toString(Student[] draftee) {
		String string = "\nDraftee:\n";
		for (int i = 0; i < draftee.length; i++) {
			string += draftee[i] + "\n";
		}
		return string;
	}

}
