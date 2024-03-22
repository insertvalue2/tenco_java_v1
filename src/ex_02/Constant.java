package ex_02;

/**
 * 간단한 컴파일 용어에 대한 이해,
 * 상수에 대한 이해
 */
public class Constant {

	// (사전기반 지식) 
	// ctrl + s 누르면 저장 -> IDE 툴이 javac Constant.java 명령어를 수행 -> Constant.class 생성
	// 위 과정을 컴파일을 수행한다 라고 이야기 할 수 있습니다.
	// 코드를 작성 ..
	// 코드를 작성하는 시점, 작성한 코드를 실행하는 시점
	public static void main(String[] args) {

		final int MAX_NUM = 100;//상수를 선언과 초기화를 동시에
		final int MIN_NUM;//상수 선언, 메모리 int형 크기의 공간에 이름을 MIN_NUM 라고 선언
		 
		MIN_NUM = 0; // 상수에 값을 초기화 (값을 넣다)
		
		System.out.println("---------------------------");
		
		// 원주율 상수 선언
        final double PI = 3.14159;
        // 원의 반지름 상수 선언
        final int RADIUS = 10;
        
        // 원의 둘레 계산(원의 가장자리를 따라 측정한 길이)
        double circumference = 2 * PI * RADIUS;
        // 원의 면적 계산(원 내부의 공간의 크기) 
        double area = PI * RADIUS * RADIUS;

        // 결과 출력
        System.out.println("원의 둘레: " + circumference);
        System.out.println("원의 면적: " + area);
			

		
	} // end of main method

} // end of class
