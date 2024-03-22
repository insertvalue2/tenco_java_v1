package ex_03;

/**
 * 산술 복합 대입 연산자
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것
 */
public class Operation4 {

	public static void main(String[] args) {
		// 시작 값 설정
		int score = 0;

		// 점수 추가
		score += 10; 
		System.out.println("점수 추가 : " + score);

		// 점수 감소
		score -= 5; 
		System.out.println("점수 감소 : " + score);

		// 점수 두 배 증가
		score *= 2; 
		System.out.println("점수 두 배 증가 : " + score);

		// 점수 반으로 감소
		score /= 2; 
		System.out.println("점수 반으로 감소: " + score);

		// 점수에 대한 나머지 연산
		score %= 3; 
		System.out.println("점수에 대한 나머지 연산: " + score);

		//! 복합할당 연산자로 문자열 처리
		String message = "Your final score is ";
		message += score; // 점수를 문자열에 추가
		System.out.println(message);
	
		// 변수에 효용 
		
	}
}
