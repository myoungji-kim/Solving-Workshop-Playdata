package workshop6_4;

public class Rectangle extends Shape implements Resize {
	Rectangle(){}
	Rectangle(int width, int height, String colors){
		super(width, height, colors);
	}
	
	public double getArea() {
		return (double) getWidth()*getHeight();
	}
	
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}
	
	@Override
	public String toString() {
		return "Rectangle" + " " + getArea() + " " + getColors();
	}
}
