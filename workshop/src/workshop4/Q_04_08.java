package workshop4;

import java.util.Arrays;

public class Q_04_08 {

	public static void main(String[] args) {
		int[] score = {99, 34, 67, 22, 11, 9};
		
		// 1 sort 메서드 이용
//		Arrays.sort(score);
//		System.out.printf("최대값:%d\r", score[score.length-1]);
//		System.out.printf("최소값:%d", score[0]);
//	
		// 2 for문 이용
		int max = score[0];
		int min = score[0];
		for (int i=1; i<score.length; i++) {
			if (score[i] >= max) max = score[i];
			if (score[i] <= min) min = score[i];
		}
		
		System.out.printf("최대값:%d\r", max);
		System.out.printf("최소값:%d", min);
	}

}
