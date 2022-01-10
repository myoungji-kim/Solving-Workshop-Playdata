package workshop3;

public class Q_03_01 {
	public static void main(String[] args) {
		int inx = 15;
		// 1. int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식
		if (inx > 10 && inx < 20) {
			System.out.println("true - 1");
		}
		
		char ch1 = ' ';
		// 2. char형 변수 ch가 공백이나, 탭이 아닐 때 true인 조건식
		if (ch1 == ' ' && ch1 != '	') {
			System.out.println("true - 2");
		}
		
		char ch2 = 'x';
		// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		if (ch2 == 'x' || ch2 == 'X') {
			System.out.println("true - 3");
		}
		
		
		char ch3 = '2';
		// 4. char형 변수 ch3가 숫자 ('0'~'9')일 때 true인 조건식
//		if ((int) ch3 >= 48 && (int) ch3 <= 57) {
//			System.out.println("true - 4");
//		}
//		
		// 작은 따옴표 붙으면 되네? 왜???
		if (ch3 >= '0' && ch3 <= '9') {
			System.out.println("true - 4 - 2");
		} else {
			System.out.println("4 - 2 False");
		}
		
		
		char ch4 = 'a';
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		if((int) ch4 >= 65 && (int) ch4 <= 122){
			System.out.println("true - 5");
		}
		
		int year = 40;
		// 6. int형 변수 year가 400으로 나눠 떨어지거나, 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 조건식
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
			System.out.println("true - 6");
		}
		
		boolean powerOn =false;
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		if(!powerOn){
			System.out.println("true - 7");
		}
	}
}
