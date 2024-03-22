package ex_03;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정 할 경우
 * 두 번째 조건을 평가하지 않는 것 
 */
public class Operation7 {

	public static void main(String[] args) {
		int number = 5; // 초기 숫자 값
		int index = 0; // 인덱스 값

		// 논리 곱 (&&)을 사용한 빠른 평가
		// 첫 번째 조건이 false 이므로, 두 번째 조건은 평가되지 않음
		boolean result = ((number = number + 10) < 10) && ((index = index + 2) < 10);
		System.out.println("논리 곱 결과: " + result);
		System.out.println("number 값: " + number); // number는 변경됨
		System.out.println("index 값: " + index); // index는 변경되지 않음

		System.out.println("============");

		// number 값 재설정
		number = 5;

		// 논리 합 (||)을 사용한 빠른 평가
		// 첫 번째 조건이 true 이므로, 두 번째 조건은 평가되지 않음
		result = ((number = number + 10) < 10) || ((index = index + 2) < 10);
		System.out.println("논리 합 결과: " + result);
		System.out.println("number 값: " + number); // number는 다시 변경됨
		System.out.println("index 값: " + index); // index는 여전히 변경되지 않음

	}

}
