package useful.ex01;



public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안", "헤르만 헤세");
		
		// toString() 재정의 전후 비교 하기 
		System.out.println(book);
	}
}

