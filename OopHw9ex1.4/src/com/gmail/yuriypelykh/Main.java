package com.gmail.yuriypelykh;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayDeque<String> queue = new ArrayDeque<String>();

		queue.addLast("Sheldon");
		queue.addLast("Leonard");
		queue.addLast("Volovitc");
		queue.addLast("Kutrapalli");
		queue.addLast("Penny");

		System.out.println("Queue: " + queue);

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Input sold Colas number: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			String human = queue.pollFirst();
			queue.addLast(human);
			queue.addLast(human);
		}
		System.out.println("Now queue is: " + queue);

	}

}
