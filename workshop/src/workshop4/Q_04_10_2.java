package workshop4;

import java.util.Arrays;

public class Q_04_10_2 {

	static boolean inputTwo(int[] arg) {
		if(arg.length != 2) return false;
		else return true;
	}
	
	static boolean isDigit(int[] arg) {
		int cnt = 0;
		int[] nums = {1, 2, 3, 4, 5};
		for (int num : nums) {
			for (int a : arg) {
				if (a==num) cnt++;
			}
		}
		if (cnt==2)	return true;
		else return false;
	}
	
	public static void main(int[][] args) {
		int exit = 0;
		int sum = 0;
		int[][] makeList = {{0, 0}, {0, 0}}; // 고쳐 ~~~ 
		
		if (!inputTwo(args[0]) || !inputTwo(args[1])) {
			System.out.println("다시 입력하세요");
			exit ++;
		} else if (!isDigit(args[0]) || !isDigit(args[1])) {
			System.out.println("숫자를 확인하세요");
			exit ++;
		} 
		
		if (exit == 0) {
			for (int[] list : makeList) {
				for (double l : list) {
					l = (Math.random()*4)+1;
					sum += l;
				}
			}
			
			double avg = sum/(args[0].length)*(args[1].length);
			System.out.println("sum="+String.format("%.1f", sum)); // 소수점 왜 안 나와 ... ????
			System.out.println("avg="+String.format("%.1f", avg));
		}
		
	}

}
