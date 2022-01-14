package workshop6_4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		// (1. 조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성
		// 6개의 도형 객체를 배열에 추가
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3]  = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		
		
		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력
		System.out.println("기본 정보");
		for (int i=0; i<shape.length; i++) {
			System.out.println(shape[i].toString());
		}
		
		// 모든 객체들을 setResize함수를 이용하여 5를 입력하고 사이즈를 변경 후
		for (Shape s : shape) {
			Resize resize = (Resize) s;
			resize.setResize(5);
		}
//		((Triangle) shape[0]).setResize(5);
//		((Rectangle) shape[1]).setResize(5);
//		((Triangle) shape[2]).setResize(5);
//		((Rectangle) shape[3]).setResize(5);
//		((Triangle) shape[4]).setResize(5);
//		((Rectangle) shape[5]).setResize(5);
		
		
		// 화면에 출력 (단, for Loop문을 이용)
		System.out.println("\r사이즈를 변경 후 정보");
		for (int i=0; i<shape.length; i++) {
			System.out.println(shape[i].toString());
		}
	}
}
