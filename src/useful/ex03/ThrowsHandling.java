package useful.ex03;

public class ThrowsHandling {
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		// 1 단계 
//		try {
//			calc.divide(100, 0);
//		} catch (Exception e) {
//			System.out.println("야! 어떤수를 0으로 나눌수 없어");
//		}
		
		// 2 단계 
		try {
			calc.divide(100, 0);
		} catch (DivideByZeroError e) {
			System.out.println(e.getCustomMsg());
		}
		
	}
}


class Calc {
	
	// 1단계 
	// 이 메서드를 호춣라는 쪽에서 예외 처리를 알아서 구현해!
//	public int divide(int n1, int n2) throws Exception {
//		System.out.println("정수 나눗셈 동작 1");
//		// 예외가 발생할 수 있는 코드(런타임 오류) 
//		// try-catch 를 작성하거나 던질 수 있다.  
//		return n1 / n2;
//	}
	
	// 2단계 
	// 이 메서드를 호춣라는 쪽에서 예외 처리를 알아서 구현해!
	public int divide(int n1, int n2) throws DivideByZeroError {
		System.out.println("<< 사용자 정의 예외 클래스 사용 방법 >> ");
		int result = 0 ; 
		try {
			result = n1 / n2;
		} catch (Exception e) {
			throw new DivideByZeroError("0으로 나누지 마세요");
		}
		return n1 / n2;
	}
	
}
