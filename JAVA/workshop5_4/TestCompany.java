package workshop5_4;

public class TestCompany {

	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		
		Company company = new Company(money);
		System.out.println("연 기본급 합: "+company.getIncome());
		System.out.println("세후: "+company.getAfterTaxIncome());
		
		System.out.println("연 보너스 합: "+company.getBonus());
		System.out.println("세후: "+company.getAfterTaxBonus());
		
		System.out.println("연 지급액 합: "+(company.getAfterTaxIncome()+company.getAfterTaxBonus()));
	}

}
