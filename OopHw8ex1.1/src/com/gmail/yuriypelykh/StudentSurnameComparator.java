package com.gmail.yuriypelykh;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 != null && o2 == null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		if (o1 == null && o2 == null) {
			return 0;
		}

		Student a = (Student) o1;
		Student b = (Student) o2;

		if (a.getSurname().compareTo(b.getSurname()) > 0) {
			return 1;
		}
		if (a.getSurname().compareTo(b.getSurname()) < 0) {
			return -1;
		}
		return 0;
	}

}
