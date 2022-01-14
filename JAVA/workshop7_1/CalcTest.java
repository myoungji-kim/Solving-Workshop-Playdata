package workshop7_1;

import java.util.Arrays;
import java.util.List;

public class CalcTest {
	public static void main(String[] args) {
		boolean isGo = true;
		if (args.length != 3) {
			System.out.println("다시 입력 하세요");
			isGo = false;
		}

		if (isGo) {
			Calculator calc = new Calculator();
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[2]);
			String sign = args[1];
			double result = 0;
			
			if (sign.equals("+")) {
				result = calc.plus(a, b);
			} else if (sign.equals("-")) {
				result = calc.minus(a, b);
			} else if (sign.equals("x")) {
				result = calc.multiplication(a, b);
			} else if (sign.equals("/")) {
				result = calc.divide(a, b);
//				try {
//					result = calc.divide(a, b);
//				} catch (Exception e){
//					e.printStackTrace();
//				}
			}
			System.out.println("결과 : "+result);
		}
	}
}
