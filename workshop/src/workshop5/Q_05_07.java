package workshop5;

class Student3 {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Student3(){}
	Student3(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	String studentInfo() {
		return "이름 : "+name+", 나이 : "+age+", 신장 : "+height+", 체중 : "+weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}

public class Q_05_07 {
	public static void main(String[] args) {
		Student3 studentArray [] = new Student3[3];
		studentArray[0] = new Student3("김띵지", 24, 150, 48);
		studentArray[1] = new Student3("갓빵찬", 20, 180, 60);
		studentArray[2] = new Student3("카푸치노", 21, 189, 65);
		int[] ageArray = new int[3];
		int[] heightArray = new int[3];
		int[] weightArray = new int[3];
		
		for (int i=0; i<studentArray.length; i++) {
			System.out.println((i+1)+"번째 학생에 대한 정보");
			System.out.println(studentArray[i].studentInfo());
			System.out.println("+---------------------------+");
			
			ageArray[i] += studentArray[i].getAge();
			heightArray[i] += studentArray[i].getHeight();
			weightArray[i] += studentArray[i].getWeight();
		}
		
		System.out.println("나이 평균 : " + (String.format("%.3f", sum(ageArray)/studentArray.length)));
		System.out.println("신장 평균 : " + (String.format("%.3f", sum(heightArray)/studentArray.length)));
		System.out.println("체중 평균 : " + (String.format("%.3f", sum(weightArray)/studentArray.length)));
		System.out.println("+---------------------------+");
		
		System.out.println("나이가 가장 많은 학생: "+studentArray[getMax(ageArray)].getName());
		System.out.println("나이가 가장 적은 학생: "+studentArray[getMin(ageArray)].getName());
		System.out.println("신장이 가장 큰 학생: " +studentArray[getMax(heightArray)].getName());
		System.out.println("신장이 가장 작은 학생: "+studentArray[getMin(heightArray)].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생: "+studentArray[getMax(weightArray)].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: "+studentArray[getMin(weightArray)].getName());
		
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
			if (maxInt < array[i]) {
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
			if (minInt > array[i]) {
				minInt = array[i];
				index = i;
			}
		}
		return index;
	}
}
