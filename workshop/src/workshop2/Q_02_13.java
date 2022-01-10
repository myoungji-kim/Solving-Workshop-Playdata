package workshop2;

public class Q_02_13 {
	public static void main(String[] args) {
		String mesg = "     김띵지/띵띵띵/띵지띵     ";
		
		System.out.printf("문자열 길이(공백포함): %d \r", mesg.length());
		System.out.printf("공백제거: %s \r", mesg.trim());
		System.out.printf("공백제거된 문자열 길이: %d \r", mesg.trim().length());
		System.out.printf("부분열: %s \r", mesg.trim().substring(0, 7));
		String[] mesgList = mesg.trim().split("/");
		System.out.printf("김띵지 출력: %s \r", mesgList[0]);
		System.out.printf("띵지띵 출력: %s \r", mesgList[2]);
	}
}
