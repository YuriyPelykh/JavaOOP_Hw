package com.gmail.yuriypelykh;

public class Triangle extends Shape {

	private Point pA = new Point();
	private Point pB = new Point();
	private Point pC = new Point();

	public Triangle(Point pA, Point pB, Point pC) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	public double sideLength(Point pA, Point pB) {
		return Math.sqrt(Math.pow(pB.getX()-pA.getX(), 2) + Math.pow(pB.getY()-pA.getY(), 2));
	}
	
	@Override
	double getPerimetr() {
		double sAB = sideLength(pA, pB);
		double sBC = sideLength(pB, pC);
		double sAC = sideLength(pA, pC);
		return sAB + sBC + sAC;
	}

	@Override
	double getArea() {
		return (0.5 * Math.abs(
				(pB.getX() - pA.getX()) * (pC.getY() - pA.getY()) - (pC.getX() - pA.getX()) * (pB.getY() - pA.getY())));
	}

	@Override
	public String toString() {
		return "Triangle [pA=" + pA + ", pB=" + pB + ", pC=" + pC + "]";
	}
	
	
}
