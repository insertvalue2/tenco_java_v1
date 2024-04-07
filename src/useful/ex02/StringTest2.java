package useful.ex02;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str1 = new String("Hello ");
		String str2 = new String("World");
		// String 값의 주소값을 확인 할려면 identityHashCode 사용 
		System.out.println(System.identityHashCode(str1));
		
		// concat() String 객체의 문자열을 연결해주는 메서드 이다. 
		str1 = str1.concat(str2);
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

	}
}
