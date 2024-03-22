package ex_04;

public class WhileTest2 {

	public static void main(String[] args) {
		// 특정 조건일 생길 때 반복문을 종료 시켜 보자.
		int start = 0; 
		final int END = 50; 
		
		// 1단계 while (flag = (start++ < END)) {
		while ((start++ < END)) { // 2단계 -> flag 변수 제거 가능
			System.out.println("start : " + start);
		}
		System.out.println("while 문을 종료 합니다.");
	}
}
