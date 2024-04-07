package useful.ex05;

public class Father extends Thread {
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금 시키기 
		account.saveMoney(10_000);
	}
}