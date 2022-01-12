package workshop5_7;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		double sumAge = 0;
		double sumHeight = 0; 
		double sumWeight = 0;
		int[] ages = new int[3];
		int[] heights = new int[3];
		int[] weights = new int[3];
		
		int index = 0;
		for (int i=0; i<studentArray.length; i++) {
			System.out.println((i+1)+"번째 학생에 대한 정보");
			System.out.println(studentArray[i].studentInfo());
			System.out.println("+---------------------+");
			
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
			
			ages[i] += studentArray[i].getAge();
			heights[i] += studentArray[i].getHeight();
			weights[i] += studentArray[i].getWeight();
		}
		
		System.out.println();
		System.out.println("나이의 평균: "+String.format("%.3f" , sumAge/3));
		System.out.println("신장의 평균: "+String.format("%.3f" , sumHeight/3));
		System.out.println("체중의 평균: "+String.format("%.3f" , sumWeight/3));
		System.out.println("+---------------------+");
		System.out.println("나이가 가장 많은 학생: "+studentArray[getMax(ages)].getName());
		System.out.println("나이가 가장 적은 학생: "+studentArray[getMin(ages)].getName());
		System.out.println();
		System.out.println("신장이 가장 큰 학생: "+studentArray[getMax(heights)].getName());
		System.out.println("신장이 가장 작은 학생: "+studentArray[getMin(heights)].getName());
		System.out.println();
		System.out.println("몸무게가 가장 많이 나가는 학생: "+studentArray[getMax(weights)].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: "+studentArray[getMin(weights)].getName());

	}
	
	// sum 구하기
	private static double sum(int[] array) {
		double sum = 0.0;
		for (int i=0; i<array.length; i++) sum += array[i];
		return sum;
	}
	
	// max 구하기
	private static int getMax(int[] array) {
		int index = 0;
		int maxInt = array[0];
		for (int i=1; i<array.length; i++) {
			if (maxInt > array[i]) {
				maxInt = array[i];
				index = i;
			}
		}
		return index;
	}
	
	// min 구하기
	private static int getMin(int[] array) {
		int index = 0;
		int minInt = array[0];
		for (int i=1; i<array.length; i++) {
			if (minInt < array[i]) {
				minInt = array[i];
				index = i;
			}
		}
		return index;
	}
	

}
