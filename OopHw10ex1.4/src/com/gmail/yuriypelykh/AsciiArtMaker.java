package com.gmail.yuriypelykh;

import java.util.HashMap;
import java.util.Map;

public class AsciiArtMaker {
	
	private Map<Character, String> charMap = new HashMap<Character, String>();
	private String j = "    ##;" + 
					   "    ##;" + 
					   "    ##;" + 
					   "##  ##;" + 
					   " #### ;";
	
	private String a =" #### ;" + 
					  "##  ##;" + 
					  "##  ##;" + 
					  "######;" + 
					  "##  ##;";
	
	private String v = "##  ##;" + 
					   "##  ##;" + 
					   "##  ##;" + 
					   " #### ;" + 
					   "  ##  ;";
	
	private String space = "    ;" + 
			   			   "    ;" + 
			   			   "    ;" + 
			   			   "    ;" + 
			   			   "    ;";
	
	public AsciiArtMaker() {
		super();
		charMap.put('a', this.a);
		charMap.put('j', this.j);
		charMap.put('v', this.v);
		charMap.put('A', this.a);
		charMap.put('J', this.j);
		charMap.put('V', this.v);
		charMap.put(' ', this.space);
	}

	public void printArt (String word) {
		char[] chr = word.toCharArray();
		System.out.println();
		try {
		for (int i = 0; i < 5; i++) {
			String printLine = ""; 
			for (int j = 0; j < chr.length; j++) {
				printLine += " " + (charMap.get(chr[j]).split("[;]"))[i];
			}
			System.out.println(printLine);
		}
		}catch(NullPointerException e) {
			System.out.println("Demo Version! Only characters 'a','v','j' and 'Space' are avaliable!");
		}
	}
}
