package com.gmail.yuriypelykh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {

	private String dictionaryName;
	private Map<String, String> dictionary = new HashMap<>();

	public Dictionary(String dictionaryName) {
		super();
		this.dictionaryName = dictionaryName;
	}

	public void addWordToDictionary(String en, String ua) {
		dictionary.put(en, ua);
		saveDictionary();
	}
	
	public void importDictionaryFromFile (File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] translation = line.split("[;]");
				this.dictionary.put(translation[0],translation[1]);
			}
			saveDictionary();
			System.out.println("Dictionary imported from " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveDictionary() {
		File file = new File(dictionaryName + ".tr");
		try (PrintWriter pw = new PrintWriter(file)) {
			Set<String> keys = dictionary.keySet();
			for (String k : keys) {
				pw.print(k + ";" + dictionary.get(k) + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary writting to file error!");
		}
	}

	public void saveDictionaryAs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name to save: ");
		String fileName = sc.nextLine();
		sc.close();
		File file = new File(fileName);
		try (PrintWriter pw = new PrintWriter(file)) {
			Set<String> keys = dictionary.keySet();
			for (String k : keys) {
				pw.print(k + ";" + dictionary.get(k) + "\n");
			}
			System.out.println("Done!");
			System.out.println(dictionaryName + " dictionary saved to " + file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary writting to file error!");
		}
	}

	public void translateText(File srcFile) {
		String[] enFile = readTextFromFile(srcFile).split("[ .,!?]");
		File dstFile = new File("Ukrainian.out");
		try (PrintWriter pw = new PrintWriter(dstFile)) {
			for (String word : enFile) {
				if (dictionary.get(word) != null) {
				pw.print(dictionary.get(word) + " ");
				}
			}
			System.out.println("Translation done!");
			System.out.println("Translation saved to file " + dstFile.getAbsolutePath());
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary writting to file error!");
		}
	}

	public String readTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			while ((text = br.readLine()) != null) {
				sb.append(text);
			}
			System.out.println("File " + file.getAbsolutePath() + " imported");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Dictionary: " + dictionaryName + " " + dictionary;
	}

}
