package ex_10;

public class Bank {
	// 아무것도 지정하지 않으면 default (접근 제어 지시자 이다)
	// int balance;
	// private -> class Bank { 여기 안에서만 접근 가능하다. }
	private int balance;
	public String name;

	// 입금하다.
	public void deposit(int money) {
		balance += money;
		showInfo();
	}

	// 출금하다.
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은 : " + balance + " 입니다");
	}
}
