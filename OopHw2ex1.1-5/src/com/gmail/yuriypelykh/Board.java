package com.gmail.yuriypelykh;

import java.util.Arrays;

public class Board {

	private Shape[] sp = new Shape[4];

	public Board() {
		super();
	}

	public Board(Shape[] sp) {
		super();
		this.sp = sp;
	}

	public Shape[] getSp() {
		return sp;
	}

	public void setSp(Shape[] sp) {
		this.sp = sp;
	}

	public void putFig(Shape shape) {
		int freePlace = -1;
		for (int i = 0; i < sp.length; i++) {
			if (sp[i] == null) {
				sp[i] = shape;
				freePlace = 1;
				break;
			}
		}
		if (freePlace == -1) {
			System.out.println("No place for your figure on the board");
		} else if (freePlace == 1) {
			System.out.println("Figure placed successfully");
		}
	}

	public void rmFig(Shape shape) {
		int freePlace = -1;
		for (int i = 0; i < sp.length; i++) {
			if (sp[i] == shape) {
				sp[i] = null;
				freePlace = 1;
				break;
			}
		}
		if (freePlace == -1) {
			System.out.println("No such figure on the board");
		} else if (freePlace == 1) {
			System.out.println("Figure removed successfully");
		}
	}

	public void showBoard() {
		System.out.println("\nFigures on board:");
		double area = 0;
		for (int i = 0; i < this.sp.length; i++) {
			if (sp[i] != null) {
				System.out.println(sp[i]);
				area += sp[i].getArea();
			}
		}
		System.out.println("Summary area of placed figures: " + area + " cm^2\n");

	}

	@Override
	public String toString() {
		return "Board [sp=" + Arrays.toString(sp) + "]";
	}

}
