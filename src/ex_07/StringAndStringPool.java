package ex_07;

public class StringAndStringPool {

	public static void main(String[] args) {
		
		String s1 = new String("str");
		String s2 = new String("str");
		String s3 = "str";
		String s4 = "str";
		String s5 = s1; 
		// hashCode()는 자바에서 객체의 메모리 주소를 기반으로 
		// 생성된 정수 값을 반환하는 메서드입니다.
		// String 에 실제 주소를 확인할려면 identityHashCode 사용해야 한다.
		System.out.println("s1 hashcode : " + System.identityHashCode(s1));
		System.out.println("s2 hashcode : " + System.identityHashCode(s2));
		System.out.println("s3 hashcode : " + System.identityHashCode(s3));
		System.out.println("s4 hashcode : " + System.identityHashCode(s4));
		System.out.println("s5 = s1 : " + System.identityHashCode(s5));
	}
}
