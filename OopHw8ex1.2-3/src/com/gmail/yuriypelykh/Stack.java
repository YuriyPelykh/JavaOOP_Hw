package com.gmail.yuriypelykh;

public class Stack {
	private int maxSize;
	private Object[] stackArray;
	private int top = -1;
	private Blacklist blacklist = new Blacklist(); 

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		stackArray = new Object[maxSize];
	}
	
	public Blacklist getBlacklist() {
		return blacklist;
	}

	public void setBlacklist(Class<?> cl) {
		this.blacklist.addClassToBlacklist(cl);
	}

	public void addElementToStack(Object element) {
		if(this.blacklist.isInBlacklist(element)) {
			System.out.println("\nSuch class of objects is forbidden in stack\n");
		} else {
			stackArray[++top] = element;
			System.out.println("Object "+ element + " was added to stack");
		}
	}
	
	public Object getnDelElementFromStack(int index) {
		if (index - 1 >= 0 && index - 1 <= top) {
			System.out.println(stackArray[index - 1] + " - deleted from stack");
			hopUpElement(stackArray, index);
			return stackArray[top--];
		} else {
			System.out.println("\nIncorrect stack element number or stack position is empty.\n"
					+ "Enter stack element number from 1 to " + (top + 1) + " to delete");
		}
		return -1;
	}

	public void hopUpElement(Object[] a, int index) {
		for (int i = index - 1; i <= top - 1; i++) {
			Object temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
	}

	public Object readTop() {
		return stackArray[top];
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = top; i >= 0; i--) {
			str = str + stackArray[i].toString() + "\n";
		}
		return "\nIn stack:\n" + str;
	}

}
