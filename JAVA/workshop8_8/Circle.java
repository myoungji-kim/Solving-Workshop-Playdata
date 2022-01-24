package workshop8_8;

public class Circle extends Shape implements Movable {
	private int radius;

	public Circle(){}

	public Circle(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}
	
	@Override // 도형의 넓이를 리턴
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override // 도형의 둘레를 리턴
	public double getCricumference() {
		return radius*2*3.14;
	}
	
	@Override // 도형의 좌표를 변경 - x, y 좌표가 입력한 값보다 1 더 이동
	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+y+1);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", point=" + point + "]";
	}
	
	
}
