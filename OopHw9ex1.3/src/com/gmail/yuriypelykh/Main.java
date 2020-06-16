package com.gmail.yuriypelykh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		File file = new File("text.txt");
		String text = readTextFromFile(file).replaceAll("\\W", "").toLowerCase();

		Set<Character> charSet = new TreeSet<>();
		for (int i = 0; i < text.length(); i++) {
			charSet.add(text.charAt(i));
		}

		Set<Frequency> statistics = new TreeSet<>(new LettersFrequencyComparator());
		for (Character character : charSet) {
			statistics.add(new Frequency(
					1.0 / text.length() * (text.length() - text.replaceAll(Character.toString(character), "").length()),
					character));
		}

		Iterator<Frequency> itr = statistics.iterator();
		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}

	}

	public static String readTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			while ((text = br.readLine()) != null) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
