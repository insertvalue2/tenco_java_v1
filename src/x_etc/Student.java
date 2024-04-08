package x_etc;

public class Student implements Cloneable {
	
	int age; 
	String name; 
	
	public static void main(String[] args) {
		
		Student studentKim = new Student();
		studentKim.age = 10; 
		studentKim.name = "홍길동";
		
		Student studentClone = null;
		try {
			studentClone = (Student)studentKim.clone();
			
			System.out.println(studentClone.age);
			System.out.println(studentClone.name);
			studentClone.name = "야스오";
			System.out.println("원본 : " + studentKim.name);
			System.out.println("복제 : " + studentClone.name);
		} catch (CloneNotSupportedException e) {
			// implements Cloneable 하지 않으면 예외 발생  
			e.printStackTrace();
		}
		
		System.out.println(System.identityHashCode(studentKim));
		System.out.println(System.identityHashCode(studentClone));
		// 물리적인 heap hashCode 주소가 다르다는 것은 
		// 실제도 인스턴스가 두개 생성되어 있다 
		// 즉, 깊은 복사의 개념이다. 
	}
}
