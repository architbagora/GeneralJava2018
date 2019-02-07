package com.archit;

public class Triangle implements Shape {
	int b, h;

	public Triangle(int height, int base) {
		this.h = height;
		this.b = base;
	}

	@Override
	public int getArea() {
		return (h * b) / 2;
	}

	@Override
	public double getPerimeter() {
		return b + 2 * Math.sqrt((h * h) + ((b * b) / 4));
	}

}
