package week1.day5.assignment2;

/**
 * For brevity I will use a right triangle
 * @author Mark
 *
 */
public class Triangle extends Figure {
	double dim2;
	
	@Override
	void findArea() {
		System.out.println("triangle area: " + .5 * dim1 * dim2);
	}

	@Override
	void findPerimeter() {
		double hypotenuse = Math.sqrt(Math.pow(dim1, 2) + Math.pow(dim2, 2));
		System.out.println("Triangle perimeter: " + (double) (dim1 + dim2 + hypotenuse));
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

}
