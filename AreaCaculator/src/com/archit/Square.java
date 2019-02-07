package com.archit;

public class Square implements Shape{

	int side;
	
	public Square(int side){
		this.side = side;
	}
	
	@Override
	public int getArea() {
		return side*side;
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

}
