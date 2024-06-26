package useful.ex05;

public class BankAccount {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 출금, 입금
	// synchronized <-- 동기화 처리 진행
	public void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			// 10만원 ....>
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}
	// synchronized 추가 예정 
	public int widthDraw(int money) {
		// 10만원 상태
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				// 10만원 ..>
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("잘못된 입력 입니다");
				return 0;
			}
		}
	}

}
