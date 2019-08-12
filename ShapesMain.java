package week1.day5.assignment2;

import java.util.Scanner;

public class ShapesMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		Figure f = new Circle();
		System.out.println("Radius of circle?");
		f.setDim1(in.nextDouble());
		
		f.findArea();
		f.findPerimeter();
		
		Rectangle r = new Rectangle();
		System.out.println("length of rectangle?");
		r.setDim1(in.nextDouble());
		System.out.println("width of rectangle?");
		r.setDim2(in.nextDouble());
		
		r.findArea();
		r.findPerimeter();
		
		Triangle t = new Triangle();
		System.out.println("width of triangle?");
		t.setDim1(in.nextDouble());
		System.out.println("height of triangle?");
		t.setDim2(in.nextDouble());
		
		t.findArea();
		t.findPerimeter();
		
		in.close();
	}
}
