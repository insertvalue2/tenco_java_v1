package ex_19;

//학급 클래스
public class Classroom {
	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENTS = 30; // 최대 학생 수

	public Classroom(String className) {
		this.className = className;
		this.students = new Student[MAX_STUDENTS];
		this.studentCount = 0;
	}

	// 학생을 추가하는 메서드
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDENTS) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}

	// 학급에 속한 모든 학생 정보를 출력하는 메서드
	public void printStudents() {
		System.out.println("Classroom: " + className);
		System.out.println("Students:");
		for (int i = 0; i < studentCount; i++) {
			System.out.println("Name: " + students[i].getName() + ", Age: " + students[i].getAge());
		}
	}
}