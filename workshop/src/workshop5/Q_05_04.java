package workshop5;

class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	Company(){}
	Company(double salary){
		this.salary = salary;
		this.income = getIncome();
		this.afterTaxIncome = getAfterTaxIncome();
		this.bonus = getBonus();
		this.afterTaxBonus = getAfterTaxBonus();
	}
	
	double getIncome() {
		return this.salary*12;
	}
	
	double getAfterTaxIncome() {
		return this.income-(this.income*0.1);
	}
	
	double getBonus() {
		return this.salary*0.2*4;
	}
	
	double getAfterTaxBonus() {
		return this.bonus-(this.bonus*0.055);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
}

public class Q_05_04 {
	public static void main(String[] args) {
		double s1 = (double) Integer.parseInt(args[0]);
		Company c1 = new Company(s1);
		System.out.println("연 기본급 합: "+c1.getIncome()+"  세후: "+c1.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+c1.getBonus()+"  세후: "+c1.getAfterTaxBonus());
		System.out.println("연 지급액 합: "+(c1.getAfterTaxIncome()+c1.getAfterTaxBonus()));
	}
}
