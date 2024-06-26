package ex_15;

/**
 * 테스트 코드 작성
 */
public class BookTest {

	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리 하고 싶다면 - 배열 (자료구조)
		Book[] books = new Book[10]; // 배열 선언 (메모리공간 만들어 두기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		books[9] = new Book("홍길동전", "허균");
		
		// 복습 
		// 배열에 길이, 인덱스의 길이는 n - 1개 
		// 배열 크기와 안에 요소(elements)는 꼭 가득 차 있는 것은 아니다. 
		// books.length --> 배열에 길이 (10)
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) { // 방어적 코드 작성
				System.out.println(books[i].getTitle());
			}
		}
	}

}
