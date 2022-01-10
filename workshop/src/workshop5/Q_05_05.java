package workshop5;

import java.util.Arrays;

class Calc {
	private int data;
	
	Calc(){}
	Calc(int data){this.data = data;}
	
	static int calculate (int data) {
		int sum = 0;
		for (int i=2; i<=data; i+=2) sum += i;
		return sum;
	}
}

public class Q_05_05 {
	public static void main(String[] args) {
		String[] arr = {"5", "6", "7", "8", "9", "10"};
		
		if (Arrays.asList(arr).contains(args[0])){
			int data = Integer.parseInt(args[0]);
			Calc calc = new Calc(data);
			System.out.println(calc.calculate(data));
		} else {
			System.out.println("다시 입력하세요.");
		}
	}
}
