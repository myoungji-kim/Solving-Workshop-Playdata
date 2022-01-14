package workshop5_5;

public class Calc {
	public static int calculate(int data) {
		int sum = 0;
		for (int i=2; i<=data; i = i+2) {
			sum += i;
		}
		return sum;
	}
}
