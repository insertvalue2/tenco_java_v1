package ex_03;

/**
 *  산술 연산자 연습
 *  덧셈, 뺄셈, 나눗셈, 곱셈, 나머지 
 */
public class Operation2 {

	public static void main(String[] args) {

		
		int sumResult = 5 + 3;
		int subtractionResult = 5 - 3;
		int multiplicationResult = 5 * 3;
		// 심화( int --> double 변경해서 결과 확인) 
		int divisionResult = 5 / 3;  // 예상 결과값 : 1.66666666... 
		int remainderResult = 5 % 3; // 나머지 연산자 

		System.out.println("덧셈 결과: " + sumResult);
		System.out.println("뺄셈 결과: " + subtractionResult);
		System.out.println("곱셈 결과: " + multiplicationResult);
		System.out.println("나눗셈 결과: " + divisionResult);
		System.out.println("나머지 결과: " + remainderResult);

		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		int complexOperation1 = (12 + 3) / 3;
		System.out.println("(12 + 3) / 3의 결과: " + complexOperation1);

		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수 
		int oddOrEven = 25 % 2;
		System.out.println("25 % 2 (홀수 판별): " + oddOrEven);
		

		// 추가 문제 - 자바 표준 라이브러를 사용해 보자 
		// 브라우저에서 "java api 17" 을 검색 
		
		// 3. 5의 3승을 계산하여 출력하세요
		int exponentResult = (int)Math.pow(5, 3); 
		System.out.println("5의 3승: " + exponentResult);

		// 4. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		int divisionWithAbsResult = Math.abs(15 / 4);
		System.out.println("15를 4로 나눈 후의 절대값: " + divisionWithAbsResult);

	} // end of main 

} // end of class 
