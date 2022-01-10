package workshop2;

import java.util.Scanner;

public class Q_02_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소 입력해~");
		String address = scan.nextLine();
		String[] addList = address.split(" ");
		
		int charLength = address.length();
		int wordLength = addList.length;
		
		System.out.printf("문자 갯수(공백포함): %d \r", charLength);
		System.out.printf("단어 갯수: %d", wordLength);
	}
}
