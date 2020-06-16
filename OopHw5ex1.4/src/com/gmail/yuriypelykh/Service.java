package com.gmail.yuriypelykh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Service {

	public Service() {
		super();
	}

	public Group readFile(File file) {
		int lineCounter = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (; (br.readLine()) != null;)
				lineCounter++;
		} catch (IOException e) {
			System.out.println("File reading error");
		}

		Student[] list = new Student[lineCounter];

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = "";
			int counter = 0;
			for (; (str = br.readLine()) != null;) {
				String arr[] = str.split("[ ;]");
				list[counter] = new Student(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]);
				str = "";
				counter++;
			}
		} catch (IOException e) {
			System.out.println("File reading error!");
		}

		return new Group(file.getName(), list);

	}

}
