package ex_06;

public class FunctionTest2 {
	
	public static int addNum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	} // 함수 - addNum 
	
	// void - (텅빈) 리턴 값이 없다. 
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	} // 함수 - sayHello 

	public static int calcSum() {

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum;
	} // 함수 - calcSum
	
	// 메인 함수 프로그램 실행시 코드의 시작점 
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int total = addNum(num1, num2);

		sayHello("안녕하세요");
		int sum = calcSum();

		System.out.println(total);
		System.out.println(sum);
	} // end of main 
}

// 자바 언어에서 import, package 등을 제외하고 
// 대부분에 코드, 문법은 class Xxx { ... } 작성 되어야 한다. 
