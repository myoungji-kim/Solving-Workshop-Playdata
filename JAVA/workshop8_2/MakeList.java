package workshop8_2;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;

	// 기본 생성자
	public MakeList() {
		// 그냥 this.list = list로 해버리면 초기화 안해줘서 list.add할때 NullPointerException 예외 발생
		this.list = new ArrayList<Integer>();
	}

	// size 만큼의 정수형 데이터를 랜덤하게 만들어 ArrayList에 넣음
	public void makeArrayList(int size) {
		Random rd = new Random();
		int newNum = 0;
		for (int i=0; i<size; i++) {
			newNum = rd.nextInt(19)+10;
			list.add(newNum);
		}
	}

	// ArrayList의 모든 값의 평균을 계산하여 리턴
	public double getAverage() {
		double sum = 0;
		double aver = 0;

		for (int i : list) { sum += i; }
		aver = sum/list.size();
		return aver;
	}

	// 만들어진 ArrayList 정보를 리턴
	public ArrayList<Integer> getList(){
		return list;
	}
}
