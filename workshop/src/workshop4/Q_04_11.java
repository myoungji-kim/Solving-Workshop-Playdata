package workshop4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q_04_11 {
	
	// 메인 화면 -  옵션 선택
	static int selectOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("=========");
		System.out.println("타자 속도 측정\r1.시작\r2.종료");
		System.out.println("=========");
		System.out.print("메뉴 입력 => ");
		int menu = scan.nextInt();
		return menu;
	}
	
	// 타이핑 연습
	static void startTyping() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		float success = 100;
		long startTime = System.currentTimeMillis();
		boolean hasWords = true;
		String[] tWords = {"ddingji", "study", "JAVA", "hello", "bye"};
		ArrayList<String> words = new ArrayList<>(Arrays.asList(tWords));
		
		System.out.println("전체 단어 리스트");
		System.out.println("==================");
		System.out.println(words.toString());
		System.out.println("==================");
		
		while (hasWords) {
			int listLength = words.size();
			System.out.printf("남은 단어 수 : %d\r", listLength);
			int rIndex = r.nextInt(listLength);
			String giveWord = words.remove(rIndex);
			System.out.printf("제공 단어 : %s\r", giveWord);
			System.out.print("타이핑 입력 => ");
			String input = scan.nextLine();
			
			if (input.equals(giveWord)) {
				System.out.println("정답입니다\r");
			} else {
				System.out.println("오답입니다\r");
				success -= (float) 100 / tWords.length;
			} 
			
			if (words.size() == 0) hasWords = false;
		}
		
		long endTime = System.currentTimeMillis();
		double resultTime = (endTime-startTime)/1000.0;
		System.out.println("-------------------");
		System.out.println("성공률 : "+String.format("%.1f", success)+" %");
		System.out.println("시간 : "+String.format("%.1f", resultTime)+" 초");
		System.out.println("-------------------");
	}
	
	// 프로그램 종료
	static void exitService() {
		System.out.println("프로그램 종료");
	}
	
	// 옵션에 없는 메뉴 선택
	static boolean exceptMessage() {
		System.out.println("잘못 입력하셨습니다. 확인 후 다시 입력하세요.");
		return false;
	}
	
	// start main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isExcept = false;
		while (!isExcept) {
			int menu = selectOption();
			if (menu == 1) {
				startTyping();
				isExcept = true;
			} else if (menu == 2) {
				exitService();
				isExcept = true;
			} else {
				isExcept = exceptMessage();
			}
		}
		
	}
}
