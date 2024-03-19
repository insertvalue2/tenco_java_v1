package ex_01;

/**
 * 문자 데이터 타입 char 자료형의 크기는 2byte 입니다.
 */
public class DataType3 {

	// 메인 메소드
	public static void main(String[] args) {

		// 기본 자료형
		// 실수형 (1.0, 0.123, 0.00123)

		// float , double
		float floatBox1 = 0.5f; // 4 바이트 
		float floatBox2 = 0.5F; // F는 접미사, 가능한 대문자로 표기

		double doubleBox1 = 0.123;
		double doubleBox2 = 1.123456; // 8 바이트 -> 소수점을 많이 표시할 수 있기 때문에 더 정확성을 보장한다.

		System.out.println(floatBox1);
		System.out.println(floatBox2);
		System.out.println("==============");
		System.out.println(doubleBox1);
		System.out.println(doubleBox2);
		System.out.println("==============");
		//콘솔창에 값을 출력할 때 꼭 변수를 사용해야 할까??
		System.out.println(0.5F);
		System.out.println(0.5);
		
		// 실수 자료형에 기본 연산에 단위는 float 일까요 double 일까요?
		// 답 : double 

	} // end of main

} // end of class
