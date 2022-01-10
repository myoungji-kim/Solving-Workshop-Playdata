package workshop2;


public class Q_02_12 {
	public static void main(String[] args) {
		String mesg = "heLLO";
		
		System.out.printf("대문자로: %s \r", mesg.toUpperCase());
		System.out.printf("소문자로: %s \r", mesg.toLowerCase());
		System.out.printf("문자열 길이: %d \r", mesg.length());
		System.out.printf("1번째 위치 문자: %s \r", mesg.charAt(1));
		System.out.printf("문자열 연결: %s %s \r", mesg, "~~~");
		System.out.printf("h 문자열 포함 여부: %b \r", mesg.contains("h") ? true:false);
		System.out.printf("hw 문자열 포함 여부: %b \r", mesg.contains("hw") ? true:false);
		System.out.printf("O 문자를 X 문자로 변경: %s \r", mesg.replace("O", "X"));
		System.out.printf("HELLO 문자열인지 비교: %b \r", mesg.equals("HELLO") ? true:false);
		System.out.printf("HELLO 문자열인지 비교: %b", mesg.equalsIgnoreCase("HELLO") ? true:false);
	}
}
