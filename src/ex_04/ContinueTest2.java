package ex_04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중 3의 배수를 출력하세요
		int num = 1; // 초기화 부분을 반복문 밖으로 이동
		while (num <= 100) {
			if ((num % 3) != 0) {
				num++; // continue 전에 증가시켜야 함
				continue;
			}
			System.out.println(num);
			num++; // 3의 배수인 경우에도 증가 필요
		}
	}
}
