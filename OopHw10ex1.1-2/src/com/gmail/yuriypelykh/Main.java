package com.gmail.yuriypelykh;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		Dictionary enua = new Dictionary("en-ua");
		
		enua.addWordToDictionary("�at", "��");
		enua.addWordToDictionary("dog", "������");
		enua.addWordToDictionary("cow", "������");
		
		System.out.println(enua.toString());		
		
		enua.importDictionaryFromFile(new File("EN-UA.dictionary"));
		
		System.out.println(enua.toString());
		
		enua.translateText(new File("English.in"));
		
	}

}
