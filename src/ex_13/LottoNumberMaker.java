package ex_13;

import java.util.Random;

public class LottoNumberMaker {
		
	// static main method 
	public static void main(String[] args) {
		
		// java Stack memory 
		// 클래스의 인스턴스는 없는 상태 
		int number1 = LottoNumberMaker.makeNumber();
		System.out.println(number1);
	}
	
	// static 메서드 
	// 랜덤 번호 생성 해주는 기능 
	// 함수에 static 키워드 존재 여부 확인 
	public static int makeNumber() {
		// 표준 API(라이브러리) - 난수 생성기
		Random random = new Random();
		int resultNumber = random.nextInt(45);
		// 0 부터 44 범위 중 하나의 번호를 생성
		// 우리가 필요한 숫자는 1부터 45까지 
		resultNumber += 1;
		// 문제 2 
		// 여기에서는 멤버 변수, 멤버 함수를 가지고 올 수 잇을까요?
		// System.out.println(version); 불가능 
		// getVersion(); 불가능 - why?
		return resultNumber; 
	}
	
	// 멤버 변수 
	public String version = "1.0.0";
	// 멤버 함수 
	public String getVersion() {
		// 문제 1 
		// 여기에서는 static 함수를 호출 할 수 있을까요? 
		LottoNumberMaker.makeNumber(); // 가능 - why?	
		return this.version;
	}
	
	
}


