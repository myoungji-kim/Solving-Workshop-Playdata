package workshop1;

public class Q_01_01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		// 1
		System.out.println("1.");
		System.out.println("이름은 "+ name);
		System.out.println("나이는 "+ age + " 이고 주소는 " + address);
		
		// 2
		System.out.println("2.");
		System.out.print("이름은 "+ name + "\r");
		System.out.print("나이는 ");
		System.out.print(age);
		System.out.print(" 이고 주소는 ");
		System.out.print(address);
		System.out.println();
		// 3
		System.out.println("3.");
		System.out.printf("이름은 %s \r", name);
		System.out.printf("나이는 %d 이고 주소는 %s", age, address);
	}
}
