package workshop4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Q_04_07 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키 최댓값 구하기");
		System.out.print("사람 수:");
		int num = scan.nextInt();
		int[] heights = new int[num];
		
		// 1 random 메소드 이용
//		for (int i=0; i<heights.length; i++) {
//			heights[i] = (int) (Math.random()*30)+150;
//			System.out.printf("사람 %d : %d\r", i+1, heights[i]);
//		}
//		
//		Arrays.sort(heights);
//		Arrays.toString(heights);
//		System.out.printf("가장 큰 키 : %d", heights[heights.length-1]);

		// 2 random 클래스 이용
		Random r = new Random();
		for (int i=0; i<heights.length; i++) {
			heights[i] = r.nextInt(30)+150;
			System.out.printf("사람 %d : %d\r", i+1, heights[i]);
		}

		Arrays.sort(heights);
		System.out.println(Arrays.toString(heights));
		System.out.printf("가장 큰 키 : %d", heights[heights.length-1]);
	}
}
