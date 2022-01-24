package workshop8_8;

public class Rectangle extends Shape implements Movable {
	private int width;

	public Rectangle(){}

	public Rectangle(int width, int x, int y) {
		super(new Point(x, y)); // 참고
		this.width = width;
	}

	@Override // 도형의 넓이를 리턴
	public double getArea() {
		return width*width;
	}
	
	@Override // 도형의 둘레를 리턴
	public double getCricumference() {
		// TODO Auto-generated method stub
		return width*4;
	}
	
	@Override // 도형의 좌표를 변경 - x, y 좌표가 입력한 값보다 2 더 이동
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", point=" + point + "]";
	}
	
	
}
