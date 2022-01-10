package workshop4;

public class Q_04_03 {

	public static void main(String[] args) {
		int sum = 0;
		
		int[][] arr2 = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
		};
		
		for (int[] arr : arr2) {
			for (int num : arr) {
				sum += num;
			}
		}
		int total = sum;
		float aver = (float) sum / (arr2[0].length*arr2.length);
		System.out.println(sum);
		System.out.println(String.format("%.2f", aver));
	}
}
