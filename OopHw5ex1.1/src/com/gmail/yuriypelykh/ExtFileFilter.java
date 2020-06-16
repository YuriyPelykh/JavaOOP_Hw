package com.gmail.yuriypelykh;

import java.io.File;
import java.io.FileFilter;

public class ExtFileFilter implements FileFilter {

	private String[] array;

	public ExtFileFilter(String[] array) {
		super();
		this.array = array;
	}

	private boolean check(String ext) {
		for (String stringExt : array) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File filePath) {
		int pointIndex = filePath.getName().lastIndexOf(".");
		if (pointIndex == -1) {
			return false;
		}
		String ext = filePath.getName().substring(pointIndex + 1);
		return check(ext);

	}
}
