package useful.ex03;

public class StringBuilderTest {
	
	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("World");
		
		StringBuilder bufferStr = new StringBuilder(str1);
		System.out.println(System.identityHashCode(bufferStr));
		// 문자열 더하기 
		bufferStr.append(str2);
		System.out.println(System.identityHashCode(bufferStr));
		
		str1 = bufferStr.toString();
		System.out.println("str1 : " + str1);
	}
}
