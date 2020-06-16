package com.gmail.yuriypelykh;

public class Triangle {

	private double a;
	private double b;
	private double c;

	public Triangle() {

	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double calcArea() {
		double p = 0.5 * (a + b + c);
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
