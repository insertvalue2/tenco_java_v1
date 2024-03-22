package ex_03;

/**
 * 증감, 감소 연산자 ++, -- 변수에 접근해서 그 값을 오직 1을 증가, 감소 시킨다
 */
public class Operation3 {

	public static void main(String[] args) {
		// 변수의 값을 1 증가시키기
		int value1 = 1;
		value1++;
		System.out.println("value1: " + value1);

		// 변수의 값을 1 감소시키기
		int value2 = 1;
		value2--;
		System.out.println("value2: " + value2);
		
		System.out.println("---------------------------");
		 
		// 증감 연산자가 변수 뒤에 올 경우 (후위 연산자)
		int intData1 = 10;
		int resutDataBox1;

		resutDataBox1 = intData1++;
		System.out.println("뒤에 올 경우 ");
		System.out.println("intData1 : " + intData1);
		System.out.println("결과 확인 : " + resutDataBox1);
		
		System.out.println("---------------------------");
		
		// 증감 연산자가 변수 앞에 올 경우 (전위 연산자)
		int intData2 = 10;
		int resutDataBox2;
		
		resutDataBox2 = ++intData2;
		System.out.println("앞에 올 경우 ");
		System.out.println("intData2 : " + intData2);
		System.out.println("결과 확인 : " + resutDataBox2);

		// 결론: 증감 연산자는 변수의 값을 1 증가 또는 감소시킵니다.
		// 단항에 앞,뒤 위치에 따라 연산에 순서가 다르다.
	}
}
