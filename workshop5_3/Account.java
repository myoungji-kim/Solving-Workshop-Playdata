package workshop5_3;

public class Account {
	private String account; // 계좌
	private int balance; // 잔액
	private double interestRate; // 이율
	
	Account(){}
	Account(String account, int balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() { // 잔액을 기준으로 이자 계산
		return balance * interestRate * 0.01;
	}
	
	public void deposit(int money) { // 입금
		balance += money;
	}
	
	public void withdraw(int money) { // 출금
		if (balance - money < 0) {
			System.out.println("출금 불가능");
		} else {
			balance -= money;
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
	
	
	@Override
	public String toString() {
		return "계좌정보: " + account + ", 현재잔액: " + balance;
	}
}	
