package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {
		
		Vector3d a = new Vector3d(3,4,5);
		Vector3d b = new Vector3d(2,-3,4);
		
		System.out.println("Vector addition of a and b : " + a.vectorAddition(b).toString());
		System.out.println("Scalar product of a and b: " + b.scalarProduct(a));
		System.out.println("Vector product of a and b: " + a.vectorProduct(b).toString());

	}

}