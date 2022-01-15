package workshop7_2;

public class Account {
	private String account; // 계좌
	private double balance; // 잔액
	private double interestRate; //이율

	Account(){}
	Account(String account, double balance, double interestRate){
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	// 잔액을 기준으로 이자 계산
	public double calculateInterest() {
		return balance * interestRate * 0.01;
	}
	
	// 입금을 통해 잔액 정보 증가
	// 입금액이 0보다 적으면 AccountException 발생
	public void deposit(double money) throws AccountException {
		if (money < 0) {
			throw new AccountException("입금 금액이 0보다 적습니다.");
		} else {
			this.balance += money;
		}
	}
	
	// 출금을 통해 잔액 정보 감소
	// 출금액이 0보다 적으면 Exception 발생
	// 출금액이 현재 잔액보다 많으면 AccountException
	public void withdraw(double money) throws AccountException {
		if (money > balance) {
			throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		} else {
			this.balance += money;
		}
	}
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
