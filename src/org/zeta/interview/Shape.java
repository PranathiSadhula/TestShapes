package org.zeta.interview;

public class Shape {
	/*
	 * 
	 * Create a class of Shape which can help to instantiate objects. The objects
	 * will be square, rectangle, circle, cube, sphere each object will need to have
	 * color and dimensions you need to be able to evaluate area for 2 dimension
	 * objects you need to be able to evaluate volume for 3 dimensional objects
	 * 
	 * Execute the program and then Use test ng to test the same
	 */
	String color;
	int length;
	int bredth;
	int height;
	int radius;

	public Shape(String color, int radius) {
		this.color = color;
		this.radius = radius;

	}

	public Shape(String color, int length, int bredth) {
		this.color = color;
		this.length = length;
		this.bredth = bredth;

	}

	public Shape(String color, int height, int length, int bredth) {
		this.color = color;
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}

	public double calculateArea() { // 2-d --> square, rectangle,

		return this.length * this.bredth;
	}

	
	public double calculateCircleArea() {  // circle
		double pie = 3.14285714286;
		 return pie * this.radius * this.radius;
	}
	
	public double calculateVolume() { // 3-d ---> cube, 

		return this.length * this.height * this.bredth;
	}

	public double calculateSphereVolume() { //sphere 
		
		double pie = 3.14285714286;
		return (4.0 / 3.0) * pie * (radius * radius * radius);
	}

	
	public static void main(String[] args) {
		Shape sqaure = new Shape("blue", 4, 4);
		System.out.println("Area of square : "+sqaure.calculateArea());
		
		Shape rect = new Shape("black", 4, 6);
		System.out.println("Area of rectangle : "+rect.calculateArea());
	
		Shape cube = new Shape("black", 4, 4, 4);
		System.out.println("Area of cube : "+cube.calculateVolume());
	
	
		
		Shape circle = new Shape("red", 4);
		System.out.println("Area of cicle : "+circle.calculateCircleArea());
		

		Shape sphere = new Shape("pink", 4);
		System.out.println("Area of sphere : "+sphere.calculateSphereVolume());
	
	}
}
