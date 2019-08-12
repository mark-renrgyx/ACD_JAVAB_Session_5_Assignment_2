package week1.day5.assignment2;

public abstract class Figure {
	
	double dim1;
	
	abstract void findArea();
	abstract void findPerimeter();
	
	public double getDim1() {
		return dim1;
	}
	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}
}
