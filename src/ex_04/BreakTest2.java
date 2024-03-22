package ex_04;

public class BreakTest2 {

	public static void main(String[] args) {
		// 중간에 멈추는 break 문을 사용한 while 반복문
		int i = 1; // 초기화 부분을 반복문 밖으로 이동

		while (i < 11) {
			System.out.println(" i : " + i);
			// 만약 i 값이 소수 7이면 멈추어라 !
			if (i % 7 == 0) {
				break; // 중간에 멈추고 반복문 하나를 빠져 나옴
			}
			i++; // 증감 부분을 반복문 내부 끝으로 이동
		}
	}
}
