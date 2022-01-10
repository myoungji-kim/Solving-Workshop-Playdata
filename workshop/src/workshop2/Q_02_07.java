package workshop2;

import java.util.Scanner;

public class Q_02_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("2. 나이를 입력하세요.");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("이름은 "+name+", 나이는 "+age+" 입니다");
	}
}
