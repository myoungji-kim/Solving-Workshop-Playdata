package workshop8_2;

import java.util.ArrayList;

public class ListTest01 {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		MakeList makeList = new MakeList();
		makeList.makeArrayList(size);
		
		ArrayList<Integer> list = makeList.getList();
		// for문 돌면서 출력
		for (int i : list) {
			System.out.print(i+" ");
		}		
		System.out.println("\r평균 : "+String.format("%.1f", makeList.getAverage()));
	}
}
