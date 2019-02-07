package com.archit;

public class Circle implements Shape {

	int r;
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public int getArea() {
		return r*r;
	}

	@Override
	public double getPerimeter() {
		return (3.14*2*r);
	}

}
