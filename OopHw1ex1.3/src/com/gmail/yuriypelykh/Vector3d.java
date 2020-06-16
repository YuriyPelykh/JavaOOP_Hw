package com.gmail.yuriypelykh;

public class Vector3d {

	private double x;
	private double y;
	private double z;

	public Vector3d() {

	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d vectorAddition(double x, double y, double z) {
		Vector3d ad = new Vector3d(this.x + x, this.y + y, this.z + z);
		return ad;
	}

	public Vector3d vectorAddition(Vector3d b) {
		Vector3d ad = new Vector3d(this.x + b.getX(), this.y + b.getY(), this.z + b.getZ());
		return ad;
	}

	public double scalarProduct(double x, double y, double z) {
		double sm = this.x * x + this.y * y + this.z * z;
		return sm;
	}

	public double scalarProduct(Vector3d b) {
		double sm = this.x * b.getX() + this.y * b.getY() + this.z * b.getZ();
		return sm;
	}

	public Vector3d vectorProduct(double x, double y, double z) {
		Vector3d vp = new Vector3d(this.y * z - this.z * y, this.z * x - this.x * z, this.x * y + this.y * x);
		return vp;
	}

	public Vector3d vectorProduct(Vector3d b) {
		Vector3d vp = new Vector3d(this.y * b.getZ() - this.z * b.getY(), this.z * b.getX() - this.x * b.getZ(), this.x * b.getY() + this.y * b.getX());
		return vp;
	}

	@Override
	public String toString() {
		return "(" + x + "; " + y + "; " + z + ")";
	}

}