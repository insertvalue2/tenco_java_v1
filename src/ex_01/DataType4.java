package ex_01;

/**
 * 문자 데이터 타입 char 자료형의 크기는 2byte 입니다.
 */
public class DataType4 {

	// 메인 메소드
	public static void main(String[] args) {

		// 기본 자료형
		// 논리 자료형 (사실을 관찰하고 결과값이 참, 거짓 판별)
		// 크기는 1byte 상자 입니다. 
		
		boolean isMarried = false; // 변수 선언과 동시에 초기화
		System.out.println(isMarried);
		isMarried = true;
		System.out.println(isMarried);

		boolean isOk;
		isOk = false;
		System.out.println(isOk);
		isOk = true;
		System.out.println(isOk);
		
		System.out.println("===============");		
		System.out.println(true);
		System.out.println(false);

	} // end of main

} // end of class
