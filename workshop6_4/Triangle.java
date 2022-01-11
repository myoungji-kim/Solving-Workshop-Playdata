package workshop6_4;

public class Triangle extends Shape implements Resize {
	Triangle(){}
	Triangle(int width, int height, String colors){
		super(width, height, colors);
	}
	
	public double getArea() {
		return (double) getWidth()*getHeight()/2;
	}
	
	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}
	
	@Override
	public String toString() {
		return "Triangle" + " " + getArea() + " " + getColors();
	}
}
