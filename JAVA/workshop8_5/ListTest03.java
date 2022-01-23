package workshop8_5;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {
	public static void main(String[] args) {
		Random rd = new Random();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// 1: 두 개의 ArrayList에 랜덤하게 0~9까지의 정수를 입력
		for(int i=0; i<10; i++) {
			list1.add(rd.nextInt(9));
			list2.add(rd.nextInt(9));
		}
		
		// 2: 첫 번째 ArrayList의 1번째부터 10번째까지의 숫자를 
		//	  두 번쨰 ArrayList의 1번째부터 10번째까지의 숫자로 나누는 연산 처리 진행
		// 	  분모가 0일 경우 exception 처리 + "분모가 0입니다"라는 메시지 출력
		int div = 0;
		for(int i=0; i<10; i++) {
			try{
				div = list1.get(i) / list2.get(i);
				System.out.println(list1.get(i)+"/"+list2.get(i)+"="+div);
	        }catch(ArithmeticException e){
	            System.out.println(list1.get(i)+"/"+list2.get(i)+"="+"분모가 0입니다");
	        }
		}
		
	}
}
