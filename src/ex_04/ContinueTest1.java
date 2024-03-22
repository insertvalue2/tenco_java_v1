package ex_04;

public class ContinueTest1 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중 3의 배수를 출력하세요
		int num;
		for (num = 1; num <= 100; num++) {
			if ((num % 3) != 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
