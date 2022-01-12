package workshop5_5;

public class TestCalc extends Calc {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if (num < 5 || num > 10) {
			System.out.println("다시 입력하세요");
		} else {
			System.out.println(calculate(num));
		}
	}

}
