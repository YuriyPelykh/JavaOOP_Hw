package com.gmail.yuriypelykh;

public class Main {

	public static void main(String[] args) {

		Point pA = new Point(0, 0);
		Point pB = new Point(0, 3);
		Point pC = new Point(3, 0);
		Point pD = new Point(3, 3);

		Triangle triangle1 = new Triangle(pA, pB, pC);
		Circle circle1 = new Circle(pA, pB);
		Square square1 = new Square(pA, pB, pC, pD);
		Circle circle2 = new Circle(pC, pD);

		Board bd1 = new Board();

		bd1.putFig(triangle1);
		bd1.putFig(circle1);
		bd1.putFig(square1);
		bd1.putFig(circle2);
		bd1.showBoard();

		bd1.rmFig(circle2);
		bd1.showBoard();

	}

}
