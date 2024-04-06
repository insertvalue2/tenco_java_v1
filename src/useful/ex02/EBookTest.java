package useful.ex02;

public class EBookTest {

	public static void main(String[] args) {
		
		EBook eBook1 = new EBook(1, "흐르는강물처럼", "파울로코엘료");
		EBook eBook2 = new EBook(1, "흐르는강물처럼", "파울로코엘료");
		EBook eBook3 = new EBook(10, "UI실전", "김근호");
		
		System.out.println(eBook1);
		System.out.println(eBook2);
		System.out.println(eBook3);
		
		System.out.println("-------------------");
		System.out.println(eBook1.equals(eBook1));
		System.out.println("-------------------");
		System.out.println(eBook1.equals(eBook3));
		
	}

}

