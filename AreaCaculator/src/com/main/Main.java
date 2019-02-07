package com.main;


import com.archit.Circle;
import com.archit.Rectangle;
import com.archit.Shape;
import com.archit.Square;
import com.archit.Triangle;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(2);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		
		Shape rectangle = new Rectangle(3,5);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		
		Shape triangle = new Triangle(2,8);
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
		
		Shape square = new Square(2);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
	}
}
