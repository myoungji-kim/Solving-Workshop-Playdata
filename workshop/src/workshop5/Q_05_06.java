package workshop5;

class Student2 {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Student2(){}
	Student2(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

public class Q_05_06 {
	public static void main(String[] args) {
		Student2 studentArray [] = new Student2[3];
		Student2 s1 = new Student2("김띵지", 24, 150, 48);
		Student2 s2 = new Student2("갓빵찬", 20, 180, 60);
		Student2 s3 = new Student2("카푸치노", 21, 180, 65);
		studentArray[0] = s1;
		studentArray[1] = s2;
		studentArray[2] = s3;
		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		
		for (int i=0; i<studentArray.length; i++) {
			System.out.println((i+1)+"번째 학생에 대한 정보");
			System.out.println("이름 : "+studentArray[i].getName());
			System.out.println("나이 : "+studentArray[i].getAge());
			System.out.println("신장 : "+studentArray[i].getHeight());
			System.out.println("체중 : "+studentArray[i].getWeight());
			System.out.println("+---------------------------+");
			
			sumAge += studentArray[i].getAge();
			sumHeight += studentArray[i].getHeight();
			sumWeight += studentArray[i].getWeight();
		}
		
		System.out.println("나이 평균 : " + (String.format("%.2f", sumAge/studentArray.length)));
		System.out.println("신장 평균 : " + (String.format("%.2f", sumHeight/studentArray.length)));
		System.out.println("체중 평균 : " + (String.format("%.2f", sumWeight/studentArray.length)));
	}
}
