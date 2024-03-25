package ex_10;

public class BankSystem {

	public static void main(String[] args) {
		Bank bankB = new Bank(); 
		bankB.deposit(10000);
		bankB.withdraw(6000);
		
		// 신입 개발자가 실수로 멤버 변수에 접근에서 수정  
		// 실수 --> 입금 (기능), 출금(기능) 
		// bankB.balance = 100_000;  // private 선언 하는 순간 외부에서 접근 불가 !!!! 
		// 실수 할 가능성이 생긴다.
		// 예방 -> 접근 제어시자를 할당한다 --> private 
		// 정보 출력 
		bankB.showInfo();
		// 현재 금액에 대한 정보만 받고 싶다면 
		// int currentBalance = 
	}

}
