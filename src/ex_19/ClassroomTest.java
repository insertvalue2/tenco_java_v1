package ex_19;

// 테스트 코드
public class ClassroomTest {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student student1 = new Student("Alice", 15);
		Student student2 = new Student("Bob", 16);
		Student student3 = new Student("Charlie", 17);

		// 학급 객체 생성
		Classroom classroom = new Classroom("Class A");

		// 학급에 학생 추가
		classroom.addStudent(student1);
		classroom.addStudent(student2);
		classroom.addStudent(student3);

		// 학급에 속한 학생 정보 출력
		classroom.printStudents();
	}
}