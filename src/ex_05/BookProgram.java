package ex_05;

public class BookProgram {

	public static void main(String[] args) {
		
		Book bookBox1 = new Book();
		Book bookBox2 = new Book();
		
		// 값이 아니라 주소값이 담기는 상자를 세분화 해서 부르면
		// 레퍼런스 변수(Reference Variable), 참조 변수라고 합니다.
		
		System.out.println(bookBox1);// 변수명을 통해서 다시 호출 할 수 있음
		System.out.println(bookBox2);

	} // end of main 

} // end of class 
