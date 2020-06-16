package com.gmail.yuriypelykh;

import java.util.Arrays;

public class Blacklist {

	private Class<?>[] blackList = new Class[10];

	public Blacklist() {
		super();
	}

	public void addClassToBlacklist(Class<?> cl) {
		for (int i = 0; i < this.blackList.length; i++) {
			if (this.blackList[i] == cl) {
				System.out.println("\n" + cl + " already added to blacklist");
				break;
			}
		}
		for (int i = 0; i < this.blackList.length; i++) {
			if (this.blackList[i] == null) {
				this.blackList[i] = cl;
				System.out.println(cl + " was added to blacklist");
				break;
			}
		}
	}

	public boolean isInBlacklist(Object obj) {
		for (int i = 0; i < this.blackList.length; i++) {
			if (this.blackList[i] == obj.getClass()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Blacklist [blackList=" + Arrays.toString(blackList) + "]";
	}

}
