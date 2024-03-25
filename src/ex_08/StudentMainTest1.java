package ex_08;

public class StudentMainTest1 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.name = "홍길동";
		student1.number = 10;
		student1.grade = 1;

		Student student2 = new Student("티모", 15, 1);
		// 사용자 정의 생성자를 하나라도 만들었다면 컴파일러는 기본 생성자를 만들어 주지 않는다.
		// 생성자 --> 2개 ( 생성자는 여러개 만들 수 있다)
		// 생성자 오버로딩(생성자를 여러개 만들어 두는 기법)

	} // end of main

} // end of class
