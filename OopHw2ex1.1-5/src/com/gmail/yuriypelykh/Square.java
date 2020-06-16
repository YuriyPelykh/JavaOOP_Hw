package com.gmail.yuriypelykh;

public class Square extends Shape {

	private Point pA = new Point();
	private Point pB = new Point();
	private Point pC = new Point();
	private Point pD = new Point();

	public Square() {
		super();
	}

	public Square(Point pA, Point pB, Point pC, Point pD) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
		this.pD = pD;
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

	public Point getpD() {
		return pD;
	}

	public void setpD(Point pD) {
		this.pD = pD;
	}

	public double sideLength(Point pA, Point pB) {
		return Math.sqrt(Math.pow(pB.getX() - pA.getX(), 2) + Math.pow(pB.getY() - pA.getY(), 2));
	}

	@Override
	double getPerimetr() {
		double sAB = sideLength(pA, pB);
		return 4 * sAB;
	}

	@Override
	double getArea() {
		double sAB = sideLength(pA, pB);
		return Math.pow(sAB, 2);
	}

	@Override
	public String toString() {
		return "Square [pA=" + pA + ", pB=" + pB + ", pC=" + pC + ", pD=" + pD + "]";
	}

}
