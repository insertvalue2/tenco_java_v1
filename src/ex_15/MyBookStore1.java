package ex_15;

import java.util.Scanner;

/**
 * 모든 프로그래밍은 기본은 CRUD 이다. 
 */
public class MyBookStore1 {
	// 메인 함수
	public static void main(String[] args) {

		// 준비물
		Scanner scanner = new Scanner(System.in);
		// 배열을 먼저 배열에 길이를 지정해 주어야 한다.
		Book[] books = new Book[100];
		boolean flag = true;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "5";

		// 실행에 흐름 만들어 보기
		while (flag) {
			System.out.println("** 메뉴 선택 ** ");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.종료");
			String selectedNumber = scanner.nextLine();
			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>저장하기<<");
				// 저장
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체조회하기<<");
				// 전체 조회
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택조회하기<<");
				// 선택 조회
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">>전체삭제하기<<");
				// 전체 삭제
			} else if (selectedNumber.equals(END)) {
				flag = false;
			} else {
				System.out.println("잘못된 선택 입니다ㅜㅜ");
			}

		}
	}
}
