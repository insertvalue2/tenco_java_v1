package ex_20;

/**
 * 하나의 데이터 타입을 다양한 형태로 바라 보는 것(다형성)
 * 한 요소(예: 메서드, 클래스)가 여러 형태를 
 * 가질 수 있는 능력을 의미합니다
 * 상속 관계
 * (인터페이스를 통해 다양한 구현 클래스)
 */
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("--------------");
		
		Animal animal1 = new Tiger();
		animal1.move();
		animal1.eating();

		System.out.println("--------------");
		Animal animal2 = new Human();
		animal2.move();
		animal2.eating();
	}

}
