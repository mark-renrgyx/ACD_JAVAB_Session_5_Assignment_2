package week1.day5.assignment2;

public class Circle extends Figure {
	
	// dim1 is the radius
	private final double pi = Math.PI;

	void findArea() {
		System.out.println("area = " + pi * Math.pow(this.dim1,  2));
		System.out.println("area = " + pi * Math.pow(super.dim1,  2));
	}
	
	void findPerimeter() {
		System.out.println("perimeter = " + pi * 2 * this.dim1);
	}

}
