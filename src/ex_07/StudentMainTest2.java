package ex_07;

//수입 하다. 가져 오다. 
import java.util.Scanner;

public class StudentMainTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1); // 주소값이 출력이 된다.
		System.out.println(s2); // 주소값이 출력이 된다.
		
		// **
		// 기본 데이터 타입 -- 값(리터럴)이 출력이 된다.
		// 참조 타입 - 주소값이 출력이 된다.

		System.out.println("----------------");
		System.out.println(s1.studentID);
		System.out.println(s1.studentName);
		System.out.println(s1.address);
		System.out.println("----------------");
		
		// 멤버 변수는 메모리에 올라 간 뒤 멤버 변수에 값을 할당 하지 않으면
		// 기본값으로 먼저 초기화 해 준다. (컴파일러가 알아서 초기화 해줌)
		
	}

}
