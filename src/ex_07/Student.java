package ex_07;

/**
 * 객체의 속성은 멤버 변수로, 
 * 객체의 기능은 메서드로 구현한다.
 */
public class Student {


	int studentID;
	String studentName;
	String address;

	// 메서드 정의
	public void study() {
//			System.out.println("학생이 공부를 합니다.");
		System.out.println(studentName + " 학생이 공부를 합니다.");
	}

	public void breakTime() {
//			System.out.println("학생이 휴식을 합니다.");
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}

	public void showInfo() {
		System.out.println("=========상태창==========");
		System.out.println("학생에 ID값은 : " + studentID);
		System.out.println("학생에 이름은 : " + studentName);
		System.out.println("학생에 주소는 : " + address);
		System.out.println("========================");
	}

	// 메소드란
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// 멤버 함수(member function) 이라고도 함
	// 메서드를 구현함으로써 객체의 기능이 구현 됩니다.
	
	// 연습 문제 (메소드를 정의해 보세요)
	// 학생의 기능(메서드) 3가지 정의해주세요
	// 1. 시험을 친다. takeTest , studentID + " 학생이 시험을 친다."
	public void takeTest() {
		System.out.println(studentID + " 학생이 시험을 친다.");
	}

	// 2. 청소를 한다. cleanUp , studentName + " 학생이 청소를 합니다."
	public void cleanUp() {
		System.out.println(studentID + " 학생이 청소를 합니다.");
	}

	// 3. 학생에 이름을 리턴하는 메서드 정의
	public String getName() {
		return studentName;
	}

	// 4. 학생의 번호를 리턴하는 메서듸 정의
	public int getStudentID() {
		return studentID;
	}

}
