package useful.ex05;

class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 출금하기
		account.widthDraw(5_000);
	}
}
