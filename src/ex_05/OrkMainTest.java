package ex_05;

public class OrkMainTest {

	public static void main(String[] args) {
		
		// 함수 사용하기 
		add(5, 3); // 함수에 이름으로 호출 
		int resultAdd = add(100, 200);  
		// 여러번 재사용 가능, 리턴 타입이 있다면 결과값을 받을 수 있다
	}
	
	
	static int add(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
	}

	
}
