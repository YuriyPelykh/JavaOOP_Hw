package com.gmail.yuriypelykh;

public class Circle extends Shape {

	private Point pO = new Point();
	private Point pR = new Point();

	public Circle() {
		super();
	}

	public Circle(Point pO, Point pR) {
		super();
		this.pO = pO;
		this.pR = pR;
	}

	public Point getpO() {
		return pO;
	}

	public void setpO(Point pO) {
		this.pO = pO;
	}

	public Point getpR() {
		return pR;
	}

	public void setpR(Point pR) {
		this.pR = pR;
	}

	public double radius(Point pO, Point pR) {
		return Math.sqrt(Math.pow(pR.getX() - pO.getX(), 2) + Math.pow(pR.getY() - pO.getY(), 2));
	}

	@Override
	double getPerimetr() {
		return 2 * Math.PI * radius(pO, pR);
	}

	@Override
	double getArea() {
		return Math.PI * Math.pow(radius(pO, pR), 2);
	}

	@Override
	public String toString() {
		return "Circle [center=" + pO + ", radius=" + radius(pO, pR) + "]";
	}

}
