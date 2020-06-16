package com.gmail.yuriypelykh;

public class Frequency {
	private Double fr;
	private char chr;

	public Frequency(Double fr, char chr) {
		super();
		this.fr = fr;
		this.chr = chr;
	}

	public Double getFr() {
		return fr;
	}

	public void setFr(Double fr) {
		this.fr = fr;
	}

	@Override
	public String toString() {
		return chr + " - " + String.format("%.2f", fr * 100);
	}

}
