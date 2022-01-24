package workshop8_8;

public abstract class Shape {
	protected Point point;
	
	public Shape(){}
	
	public Shape(Point point){
		this.point = point;
	}
	
	public abstract double getArea(); // 도형의 넓이를 리턴
	public abstract double getCricumference(); // 도형의 둘레를 리턴

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
