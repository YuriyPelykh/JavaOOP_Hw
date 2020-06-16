package com.gmail.yuriypelykh;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		Dictionary enua = new Dictionary("en-ua");
		
		enua.addWordToDictionary("сat", "кіт");
		enua.addWordToDictionary("dog", "собака");
		enua.addWordToDictionary("cow", "корова");
		
		System.out.println(enua.toString());		
		
		enua.importDictionaryFromFile(new File("EN-UA.dictionary"));
		
		System.out.println(enua.toString());
		
		enua.translateText(new File("English.in"));
		
	}

}
