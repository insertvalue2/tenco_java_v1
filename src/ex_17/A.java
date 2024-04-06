package ex_17;

// 선임이 작성한 코드라고 가정 
// 추가 수정이 필요하다면 어떤 식으로 사고를 할까?? 
public class A {
	String name;
	int height;
	int weight;
	int age;

	// 코드 테스트
	public static void main(String[] args) {
		// 코드 어시스턴스 확인 
		C myC = new C();
		myC.age = 100;
		System.out.println(myC.age);
	}
	
} // end of A class

// 복사 붙여 넣기에 대한 개념 
class B {
	String name;
	int height;
	int weight;
	int age;

	int level;
	String nicName;

} // end of B class

// 일을 좀 더 잘하는 사람이라면 상속을 활용 
class C extends A {
	
	int level;
	String nicName;
	String phone;

} // end of C class


