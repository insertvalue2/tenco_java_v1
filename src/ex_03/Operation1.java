package ex_03;


/**
 * 부호 연산자에 대해 알아 봅시다. 
 * 단항 연산자, 변수에 부호를 변경 
 * 변수에 값을 변경 하려면 대입 연산자와 
 * 함께 사용해야 한다. 
 */
public class Operation1 {

	public static void main(String[] args) {
		
		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		
		System.out.println(intData);// 변수에 실제 값이 변경 된 것은 아니다. 
		System.out.println("-----------------");
		
		intData = -intData; // 메모리 공간안에 실제 값을 변경 하려면 대입 연산자!
		System.out.println(intData);
		
		System.out.println("-----------------");
		
		// 연습 
		int oneStepDistance = 1; 
		final int ZERO_POINT = 0;
		int currentPosition = 0; 
		
		// 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력 하시오 
		currentPosition = ZERO_POINT - (oneStepDistance * 3); // 뺄셈연산자 --> 덧셈 연산자 
		System.out.println(currentPosition);
		// ZERO_POINT 와 currentPosition 절대값을 화면에 출력 하시오 
		
		
		// 절대값이란? 
		// 절대값은 어떤 수의 크기를 나타내는 것으로, 그 수가 0에서 얼마나 떨어져 있는지를 표시합니다. 
		// 즉, 어떤 수의 절대값은 그 수가 양수이든 음수이든 상관없이 항상 양수입니다. 0의 절대값은 0.
		
		System.out.println("부호연산자 사용 : " + -currentPosition);
		
		// currentPosition 값이 양수 였다면 - 부호 연산자를 사용 했다면 틀린 닶이 된다. 
		// Math.abs(); Math 수학과 관련된 기능들의 모임, abs() 절대값을 구해주는 기능
		System.out.println("라이브러리 사용 : " + Math.abs(currentPosition));
		
		// currentPosition = ZERO_POINT - (oneStepDistance * 3);
		// 위 수식을 + 연산으로 변경하고 결과 값을 확인하세요 
		
	} // end of main 

} // end of class 
