package workshop5_4;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;

	Company(){}
	Company(double salary){
		this.salary = salary;
	}
	
	// 연 기본급의 합
	public double getIncome() { 
		return salary * 12;
	}
	
	// 연 기본급의 합에서 세금을 공제한 금액을 리턴
	public double getAfterTaxIncome() {
		return getIncome()-(getIncome()*0.1);
	}
	
	// 연 보너스의 합을 계산하여 리턴
	public double getBonus() {
		return salary * 0.2 * 4;
	}
	
	// 연 보너스의 합에서 세금을 공제한 금액을 리턴
	public double getAfterTaxBonus() {
		return getBonus()-(getBonus()*0.055);
	}
}
