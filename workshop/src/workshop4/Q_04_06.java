package workshop4;

import java.util.Arrays;
import java.util.Scanner;

public class Q_04_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();
		int[] heights = new int[num];
		for (int i = 1; i <= num; i++) {
			System.out.printf("사람 %d :", i);
			heights[i-1] = scan.nextInt();
		}
		Arrays.sort(heights);
//		System.out.println(Arrays.toString(heights));
		System.out.printf("최댓값은 %d 입니다", heights[num-1]);
	}
}
