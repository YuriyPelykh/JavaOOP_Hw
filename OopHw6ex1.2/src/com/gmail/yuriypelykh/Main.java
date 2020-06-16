package com.gmail.yuriypelykh;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[200000];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100);
		}

		long startTime = System.currentTimeMillis();
		System.out.println(sum(array));
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + " ms" + "- Static method addition");
		
		startTime = System.currentTimeMillis();
		System.out.println(MultiThreadProcessing.sum(array, 4));
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + " ms" + " - Multithread addition");

	}

	static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}
