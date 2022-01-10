package workshop4;

import java.util.Arrays;

public class Q_04_10_1 {

	static boolean isContain(int[] args, int[] nums) {
		int cnt = 0;
		
		for (int num : nums) {
			for (int arg : args) {
				if (num == arg) cnt += 1;
			}
		}
		
		if (cnt == 2) return true;
		else return false;
	}
	
	public static void main(int[] args) {
		int sum = 0;
		int[] nums = {1, 2, 3, 4, 5};
		
		if (args.length<2  || args.length>2) {
			System.out.println("다시 입력 하세요");
		} else if (!isContain(args, nums)) {
			System.out.println("숫자를 확인하세요");
		} else {
			int[][] newList = new int[args[0]][args[1]];
			for (int[] lst : newList) {
				for (int l : lst) {
					l = (int) (Math.random()*4)+1;
					sum += l;
				}
			}
			System.out.println(Arrays.toString(newList));
			System.out.println("sum="+sum);
			System.out.println("avg="+String.format("%.2f", sum/(args[0]*args[1])));
		}
	}
}
