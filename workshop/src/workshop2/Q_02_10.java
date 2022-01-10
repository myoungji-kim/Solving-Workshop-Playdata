package workshop2;

import java.util.Scanner;

public class Q_02_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오");
		String[] address = scan.nextLine().split(" ");
		System.out.println("도명: " + address[0]);
		System.out.println("시명: " + address[1]);
		System.out.println("구명: " + address[2]);
	}
}
