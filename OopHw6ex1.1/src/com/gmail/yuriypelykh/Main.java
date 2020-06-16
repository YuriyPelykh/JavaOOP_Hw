package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			Thread thr = new Thread(new ParallelThread(), String.valueOf(i));
			thr.start();
		}
		
	}

}
