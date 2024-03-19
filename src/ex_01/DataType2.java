package ex_01;

/**
 * 문자 데이터 타입  
 * char 자료형의 크기는 2byte 입니다.  
 */
public class DataType2 {
	
	// 메인 메소드 
	public static void main(String[] args) {
	
		
		// 기본 자료형중 - 문자형(사실은 정수형) 
		// 문자를 저장하기 위한 변수를 선언할 때 사용. 
		// char 타입의 변수는 단 하나의 문자만을 저장할 수 있다. 
				
		char charBox; //2byte 크기 - 8bit * 2, 16bit 크기에 상자(메모리 공간)  
		charBox = '가';
		System.out.println(charBox);
		
		// char 타입은 단 하나의 문자만 들어갈 수 있다. 
		// charBox = 'AB'; <--- 대입 불가 
		
		// 참고! 
		// 두개 이상의 문자가 연속된 형태를(String) 문자열 -> "안녕반가워" , 문자형 = '안'
		
		// 문자 자료형 : 선언과 동시에 초기화 
		char alphabetA = 'A';
		char alphabetB = 'B';
		char alphabetBox = alphabetA;
		System.out.println(alphabetBox);
		
		System.out.println("--------------------------------");
		
		//컴퓨터에서 문자를 표현하고 처리하기 위해 문자표가 사용됩니다.(미리 만들어 놓음) 
		//ASCII, Unicode, UTF-8 이라는 표가 있습니다. 
		
		
		
		
	} // end of main
	
} // end of class 
