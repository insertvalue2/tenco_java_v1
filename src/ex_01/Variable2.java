package ex_01;

/**
 * (복습)변수에 활용  
 * 1. 변수에 선언 
 * 2. 변수에 값을 대입  
 * 3. 변수에 접근(이름을 알아야 됨) 
 */
public class Variable2 {

	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		// 변수의 이름을 만들 때(변수에 선언)의 규칙 
		
		// 1. 대소문자를 명확히 구분하며 길이제 제한이 없다. 
		int age = 10;
		int AGE = 20; 
		int aGe = 30; 
		// 단, 변수를 선언할 때 첫 글자를 대문자로 표기 하지 않습니다(권장사항) 
		
		
		// 2. 자바에서 사용하는 예약어는 사용할 수 없다. 
		// int, double, for, while, list ... 
		// int list <-- 오류 발생 
		
		// 3. 변수는 숫자로 시작할 수 없다. 
		// int 30age; <-- 오류 발생 
		// int 20Man; 
		
		// 4. 특수 문자는 _ (언더바), $(달러) 표기만 사용 가능 합니다. 
		int _count; 
		int $_tel; 
		int $count_test; 
		// int *count; <-- 오류 발생  
		
		
		// 추가 사항 - 개발자들을 반복적인 부분들을 싫어 합니다. 
		
		// 변수 선언과 동시에 초기화가 가능하다. 
		int score = 10;// 변수 선언과 동시에 초기화(값을 넣다) - 자주 사용 됨 
		int score1, score2, score3;// 한 줄에 변수를 3개 선언 (권장 x) 
				
		
	} // end of main 

} // end of class
