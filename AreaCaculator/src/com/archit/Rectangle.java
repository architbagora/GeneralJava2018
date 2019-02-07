package com.archit;

public class Rectangle implements Shape {
	int l, w;

	public Rectangle(int length, int width) {
		this.l = length;
		this.w = width;
	}

	@Override
	public int getArea() {
		return w * l;
	}

	@Override
	public double getPerimeter() {
		return 2*(l*w);
	}

	
}
