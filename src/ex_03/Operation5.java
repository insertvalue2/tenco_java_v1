package ex_03;

/**
 * 관계 연산자 
 * 연산의 결과가 true(참), false(거짓)으로 반환 됨,
 * 비교연산자 라고도 함
 */
public class Operation5 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		// 관계 연자자를 주어로 바라 보고 이해 하자!
		boolean value = (num1 > num2);
		System.out.println(value);

		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
	}

}
