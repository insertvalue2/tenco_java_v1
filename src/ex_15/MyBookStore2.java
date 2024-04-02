package ex_15;

import java.util.Scanner;

/**
 * 모든 프로그래밍은 기본은 CRUD 이다.
 */
public class MyBookStore2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Book[] books = new Book[100];
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 ** ");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.종료");
			String selectedNumber = scanner.nextLine();

			if (selectedNumber.equals(SAVE)) {
				lastIndexNumber = save(scanner, books, lastIndexNumber);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readByTitle(scanner, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				flag = false;
			} else {
				System.out.println("잘못된 입력 값 입니다.\n다시 선택 바람");
			}
		}
	}

	// 전체 조회
	public static void readAll(Book[] books) {
		System.out.println("-----전체조회하기-----");
		
		for (Book book : books) {
			if (book != null) {
				System.out.println(book.getTitle() + ", " + book.getAuthor());
			}
		}
		System.out.println();
	}

	// 선택조회하기
	public static void readByTitle(Scanner scanner, Book[] books) {
		System.out.println("-----선택조회하기-----");
		System.out.println(">>> 책 제목을 입력해주세요 <<<");
		String bookTitle = scanner.nextLine();
		boolean isFound = false;
		for (Book book : books) {
			if (book != null && book.getTitle().equals(bookTitle)) {
				System.out.println(book.getTitle() + ", " + book.getAuthor());
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("해당하는 책이 없습니다.");
		}
	}

	// 전체삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println("-----전체삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
		}
	}

	public static int save(Scanner scanner, Book[] books, int lastIndexNumber) {
		System.out.println("-----저장하기-----");
		System.out.println("책 제목을 입력하세요");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요");
		String bookAuthor = scanner.nextLine();

		// 방어적 코드 작성
		if (lastIndexNumber >= books.length) {
			System.out.println("더 이상 책을 저장할 공간이 없습니다.");
			return lastIndexNumber;
		}

		// 마지막에 저장된 번호를 알아야 그 다음 인덱스 번호에
		// 데이터를 입력할 수 있다.
		Book book = new Book(bookTitle, bookAuthor);
		books[lastIndexNumber] = book;
		lastIndexNumber++;
		return lastIndexNumber;
	}

} // end of class