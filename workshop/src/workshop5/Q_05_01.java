package workshop5;

class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	private double avg;
	private String grade;
	
	Student(){}
	Student(String name, int korean, int english, int math, int science){
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
		this.avg = getAvg();
		this.grade = getGrade();
	}
	
	// 평균 구하기
	public double getAvg() {
		double avg = (double) (korean+english+math+science)/4;
		return avg;
	}
	
	// 등급 구하기
	public String getGrade() {
		String grade="";
		if (avg >= 90) {
			grade = "A";
		} else if (avg > 70) {
			grade = "B";
		} else if (avg > 50) {
			grade = "C";
		} else if (avg > 30) {
			grade = "D";
		} else {
			grade = "E";
		}
		return grade;
	}
	
	// 기본 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
}

public class Q_05_01 {
	public static void main(String[] args) {
		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(s1.getName() + "의 평균 : " + s1.getAvg() + ", 학점 : " + s1.getGrade());
		System.out.println(s2.getName() + "의 평균 : " + s2.getAvg() + ", 학점 : " + s2.getGrade());
		System.out.println(s3.getName() + "의 평균 : " + s3.getAvg() + ", 학점 : " + s3.getGrade());
	}
}
