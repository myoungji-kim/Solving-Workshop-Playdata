package workshop3;

import java.util.Scanner;

public class Q_03_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int top;
		System.out.print("a 값: ");
		int a = scan.nextInt();
		
		System.out.print("b 값: ");
		int b = scan.nextInt();
		top = a >= b ? a : b;
		
		System.out.print("c 값: ");
		int c = scan.nextInt();
		top = a >= c ? a : c;
		System.out.println("최대값: "+top);
	}
}
