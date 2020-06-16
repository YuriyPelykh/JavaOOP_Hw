package com.gmail.yuriypelykh;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		
		System.out.println(list);
		
		list.remove(0);
		list.remove(0);
		list.remove(list.size()-1);
		
		System.out.println(list);
		
		

	}

}
