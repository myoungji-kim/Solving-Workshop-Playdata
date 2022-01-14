package workshop5_3;

public class TestAccount {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.println(account.toString());
		account.withdraw(600000);
		account.deposit(20000);
		System.out.println(account.toString());
		System.out.println("이자: "+account.calculateInterest());
	}

}
