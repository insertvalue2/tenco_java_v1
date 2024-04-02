package ex_14;

public class ArrayTest1 {
	
	// main 
	public static void main(String[] args) {
		
		// 배열은 반드시 먼저 몇 개의 데이터가 들어갈지 
		// 크기를 지정해야 사용할 수 있다. 
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];
		
		// 값 넣기 (초기화) 
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		// numbers[3] = 1002; 오류 발생 
		// 배열에 크기를 벗어남
		

		// 배열에 선언과 동시에 초기화		
		int[] grades = new int[] {5, 3, 1};
		int[] grades2 = {5, 3, 1}; // new int[]  생략 가능 
		
		// 문제 1 
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하시오 
		// 단, 배열에 이름을 마음대로 작성 하세요 
		
		// 문제 2 
		// 방금 선언한 배열에 값을 인덱스 0 ~ 2번까지 초기화 하시오
		
		
		// 문제 3 
		// 3개의 크기를 가지는 String 타입의 배열을 선언과 동시에 
		// 초기화 해주세요. 배열에 이름, 값을 마음대로 작성 
		
		
	}
}
