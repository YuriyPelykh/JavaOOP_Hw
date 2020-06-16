package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone("0971530480", 54.25);
		Phone phone2 = new Phone("0969031205", 14.12);
		Phone phone3 = new Phone("0671123456", 23.12);
		
		Network net1 = new Network("net1");
				
		phone1.regInNetwork(net1);
		phone2.regInNetwork(net1);
		
		System.out.println(phone1);
		System.out.println(phone2);
		phone1.call(phone2.getNumber());
		
		System.out.println(phone3);
		phone1.call(phone3.getNumber());
		System.out.println();
		
	}

}