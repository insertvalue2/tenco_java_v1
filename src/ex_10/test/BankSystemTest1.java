package ex_10.test;

import ex_10.Bank;

public class BankSystemTest1 {

	public static void main(String[] args) {
		Bank bankA = new Bank();
		// bankA.balance 접근 불가
		//why : 다른 패키지 에서 default 접근 제어 지시자를 
		// 접근할 수 없다. 
		bankA.name = "홍길동"; 
		// name 접근 제어 지시자는 public 이기 때문에 
		// 같은 프로젝트 안이라면 어디서든지 접근 가능하다. 

	}

}
