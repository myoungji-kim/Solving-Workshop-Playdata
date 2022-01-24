package workshop8_8;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		// 객체의 순서대로 Circle 객체와 Rectangle 객체를 생성하여 ArrayList에 저장
		Rectangle rect1 = new Rectangle(4, 5, 7);
		Rectangle rect2 = new Rectangle(5, 4, 6);
		Circle cir1 = new Circle(6, 6, 7);
		Circle cir2 = new Circle(7, 8, 3);
		
		list.add(rect1);
		list.add(rect2);
		list.add(cir1);
		list.add(cir2);
		
		// 모든 객체의 넓이 정보와 둘레 정보를 화면에 출력 (for문 이용)
		System.out.println("구분        길이   X좌표  Y좌표  Area  Circumference");
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape; // 형변환 해줘야함
				System.out.println("Rectangle   "+r.getWidth()+"     "+r.point.getX()+"     "+r.point.getY()+"     "+(int)Math.round(r.getArea())+"      "+(int)Math.round(r.getCricumference()));
			} else if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				System.out.println("Circle      "+c.getRadius()+"     "+c.point.getX()+"     "+c.point.getY()+"     "+(int)Math.round(c.getArea())+"     "+(int)Math.round(c.getCricumference()));
			}
		}
		
		// 모든 객체들에 move()함수를 이용하여 x가 10 증가, y가 10 증가
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape; 
				r.move(10, 10);
			} else if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				c.move(10, 10);
			}
		}
		
		// 되도록 변경한 후 객체 정보를 화면에 출력 (for문 이용)
		System.out.println("\r이동 후 결과");
		System.out.println("구분        길이   X좌표  Y좌표");
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape; // 형변환 해줘야함
				System.out.println("Rectangle   "+r.getWidth()+"     "+r.point.getX()+"     "+r.point.getY());
			} else if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				System.out.println("Circle      "+c.getRadius()+"     "+c.point.getX()+"     "+c.point.getY());
			}
		}
	}
}
