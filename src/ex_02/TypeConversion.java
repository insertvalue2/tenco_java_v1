package ex_02;

/**
 * 형변환이란? 
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * 자동 형변환, 강제 형변환 
 */
public class TypeConversion {
	
	public static void main(String[] args) {
		
		// 데이터의 형 변환 
		int intDataBox = 100; 	
		// 자동 형변환 
		double doubleDtaBox = intDataBox; 
		System.out.println(doubleDtaBox);
		// 정리 : 작은 상자에서 큰 상자로 가는  암시적(자동)으로 이루어 진다
		
		
		// 강제 형변환 
		final double PI = 3.14159;
		// 컴파일러가 작은 상자에 큰 상자(값을) 넣을 수 없다 
		// int intBox = PI; 컴파일 시점에 오류 발생 
		
		// 개발자가 컴파일러야 괜찮으니깐 그냥 강제로 넣어 
		int intBox = (int)PI;
		System.out.println(intBox);
		// 소수점을 그냥 버리고 값을 저장 
		
		// 연습 
		double interestRate; 
		int discount; 
		
		interestRate = 15.5;
		discount = (int)interestRate;
		 
		//문제 :  discount 출력값은 얼마 일까요? 
		System.out.println(discount);
		
		System.out.println("--------------------");
		System.out.println((int)7.5);
		
		
	} // end of main 
} // end of class 
