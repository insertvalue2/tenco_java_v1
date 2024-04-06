package useful.ex03;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		
		// == 주소값을 비교 하는 녀셕 
		// equals 는 기본 동작은 주소값을 비교 ( == )
		// 결론 문자열을 논리적으로 비교할 때는 equals 를 
		// 무조건 사용하자. 
		
		System.out.println(":================:");
		System.out.println(str1.equals(str4));
	}
}
