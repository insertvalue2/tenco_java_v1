package ex_07;

public class StudentMainTest1 {

	// 메인함수 (코드에 시작점)
	public static void main(String[] args) {

		Student studentKim = new Student();
		studentKim.studentID = 1;
		studentKim.studentName = "김길동";
		studentKim.address = "부산시 진구";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();


		System.out.println("================");
		// 연습 문제 
		// 1. studentKim의 이름을 화면에 출력하세요
		// 2. studentKim의 학생 id를 화면에 출력하세요


	} // end of main

	// 함수
	// 자바에서 함수란 객체와 상관없이 독립적으로 
	// 기능을 수행하는 일련에 코드 묶음
	public static double addDouble(double n1, double n2) {
		return n1 + n2;
	}

}
