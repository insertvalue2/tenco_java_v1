package exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// 스캐너를 사용합니다.
		Scanner scanner = new Scanner(System.in);

		int choice;

		while (true) {
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택: ");
			choice = scanner.nextInt();

			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제를 선택했습니다.");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // while 반복문을 빠져나와 프로그램 종료
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
		scanner.close(); // 스캐너 자원 닫기
	}
}
