package ex_07;

public class StackHeap {

	// main 함수
	public static void main(String[] args) {
		
		// 최상위 객체(Java 개발자들이 만들어 놓음) 
		Object o = new Object();
		String s = "str";
		int i = 5;
		
		System.out.println("main Object 주소값 : " + o.hashCode());
		System.out.println("main String 주소값 : " + s.hashCode());
		System.out.println("-----------------------------");
		// 함수 호출 
		print(o); // 모양 맞추기 
	}
	
	static void print(Object takeO) {
		Object o = takeO;
		String s = "str";
		System.out.println("print Object 주소값 : " + o.hashCode());
		System.out.println("print String 주소값 : " + s.hashCode());
	}

}
