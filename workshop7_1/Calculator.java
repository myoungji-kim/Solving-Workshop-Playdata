package workshop7_1;

public class Calculator {
	double plus(int a, int b) {
		return a + b;
	}
	
	double minus(int a, int b) {
		return a - b;
	}
	
	double multiplication(int a, int b) {
		return a * b;
	}
	
//	double divide(int a, int b) throws CalcException {
//		if (b == 0) {
//			throw new CalcException("Exception 이 발생 하였습니다. 다시 입력해 주세요");
//		}
//		return a/b;
//	}

	double divide(int a, int b) {
		double result = 0.0;
		try{
            result = a / b;
        }catch(ArithmeticException e){
            System.out.println("Exception 이 발생 하였습니다. 다시 입력해 주세요");
        }
		return result;
	}
}
