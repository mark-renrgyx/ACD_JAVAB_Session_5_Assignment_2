package week1.day5.assignment2;

public class Rectangle extends Figure {
	//dim1 would be length
	double dim2;

	@Override
	void findArea() {
		System.out.println("rectangle area: " + dim1 * dim2);

	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle perimeter: " + (dim1 + dim2) * 2);
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

}
