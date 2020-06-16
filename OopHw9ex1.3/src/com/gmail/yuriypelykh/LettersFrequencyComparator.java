package com.gmail.yuriypelykh;

import java.util.Comparator;

public class LettersFrequencyComparator implements Comparator<Frequency> {

	@Override
	public int compare(Frequency o1, Frequency o2) {
		if (o1.getFr() > o2.getFr()) {
			return -1;
		} else 
			return 1;
	}
}
