package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {

		Stack theStack = new Stack(10);

		theStack.addElementToStack(89);
		theStack.addElementToStack("string");
		theStack.addElementToStack(25.5);
		theStack.addElementToStack(342342L);

		System.out.println("\nOn top of stack: " + theStack.readTop());

		System.out.println(theStack.toString());

		theStack.getnDelElementFromStack(2);
		System.out.println(theStack.toString());

		theStack.setBlacklist(Integer.class);
		theStack.addElementToStack(36);
		theStack.addElementToStack(10.7);

		System.out.println(theStack.toString());

	}

}
