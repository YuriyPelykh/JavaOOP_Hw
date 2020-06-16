package com.gmail.yuriypelykh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		File f1 = new File("file1.txt");
		File f2 = new File("file2.txt");
		File resFile = new File("result.txt");

		writeJointToFile(jointArray(fileToArray(f1), fileToArray(f2)), resFile);

	}

	public static void writeJointToFile(String[] arr, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null) {
					pw.print(arr[i] + " ");
				}
			}
			System.out.println("Done!");
			System.out.println("Result saved to " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Error while writting to file");
		}
	}

	public static String[] jointArray(String[] a1, String[] a2) {
		String[] res = new String[Math.max(a1.length, a2.length)];
		int k = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i].equalsIgnoreCase(a2[j])) {
					boolean wordAbcent = true;
					for (int j2 = 0; j2 < res.length; j2++) {
						if (res[j2] != null && res[j2].equalsIgnoreCase(a1[i])) {
							wordAbcent = false;
							break;
						}
					}
					if (wordAbcent) {
						res[k] = a1[i];
						k++;
					}
				}
			}
		}
		return res;
	}

	public static String[] fileToArray(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String words = "";
			for (; (words = br.readLine()) != null;) {
				sb.append(words).append(" ");
			}
		} catch (IOException e) {
			System.out.println("Error while reading file " + file.getName());
		}
		for (int i = 0; i < sb.toString().length(); i++) {
			if (sb.charAt(i) == '.' || sb.charAt(i) == ',' || sb.charAt(i) == '!' || sb.charAt(i) == '?'
					|| sb.charAt(i) == ':' || sb.charAt(i) == ';') {
				sb.deleteCharAt(i);
			}
		}
		return sb.toString().split("[ ]");
	}

}
