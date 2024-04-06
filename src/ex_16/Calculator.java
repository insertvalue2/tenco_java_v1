package ex_16;

public class Calculator {

	// 정수형 덧셈 메서드
	public int add(int a, int b) {
		return a + b;
	}

	// 실수형 덧셈 메서드
	public double add(double a, double b) {
		return a + b;
	}

	// 세 정수의 덧셈 메서드
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// 네 정수의 덧셈 메서드
	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	// 문자열 연결 메서드
	public String add(String str1, String str2) {
		return str1 + str2;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// 정수형 덧셈
		System.out.println("정수형 덧셈 결과: " + calc.add(3, 5));

		// 실수형 덧셈
		System.out.println("실수형 덧셈 결과: " + calc.add(3.5, 2.7));

		// 세 정수의 덧셈
		System.out.println("세 정수의 덧셈 결과: " + calc.add(3, 5, 7));

		// 네 정수의 덧셈
		System.out.println("네 정수의 덧셈 결과: " + calc.add(3, 5, 7, 9));

		// 문자열 연결
		System.out.println("문자열 연결 결과: " + calc.add("Hello", "World"));
	}
}
