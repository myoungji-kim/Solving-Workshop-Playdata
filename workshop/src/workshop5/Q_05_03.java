package workshop5;

class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	Account(){}
	Account(String account, int balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	double calculateInterest() {
		return balance*interestRate*0.01;
	}
	
	void deposit(int money) {
		this.balance += money;
	}
	
	void withdraw(int money) {
		if (money <= this.balance) {
			this.balance -= money;
		} else {
			System.out.println("출금할 수 없습니다.");
		}
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}

public class Q_05_03 {
	public static void main(String[] args) {
		Account a1 = new Account("441-02090-1203", 500000, 7.3);
		System.out.println("계좌번호: "+a1.getAccount()+"   현재 잔액: "+a1.getBalance()+" 원");
		a1.withdraw(600000);
		a1.deposit(20000);
		System.out.println("계좌번호: "+a1.getAccount()+"   현재 잔액: "+a1.getBalance()+" 원");
		System.out.println("이자: "+ a1.calculateInterest());
	}
}
