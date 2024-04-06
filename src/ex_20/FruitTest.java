package ex_20;

public class FruitTest {
	
	public static void main(String[] args) {
		
		// 다양한 형태로 클래스(타입을)로 바라 볼 수 있다. 
		Fruit fruit1 = new Banana(); // 업캐스팅된 상태  
		Fruit fruit2 = new Peach();
		
		fruit1.showInfo();
		fruit2.showInfo();
		
		// 문제 
		// 바나나에 원산지 정보는 어떻게 출력하지??? 
		// fruit1.origin 변수를 확인할 수 없음 
		
		// 컴파일시점, 런타임 구분 
		
		System.out.println("---------------");
		String checkResult = ((Banana)fruit1).origin;
		System.out.println("바나나 원산지 : " + checkResult);
			
		System.out.println("---------------");
		// instanceof 연산자  
		// 객체가 특정 클래스의 인스턴스인지 여부를 확인하는 데 사용.
		// true, false 반환 
		if(fruit1 instanceof Banana ) {
			System.out.println("바나나 타입 입니다 ");
			// 변수에 대한 처리 
			String origin =  ((Banana)(fruit1)).origin;
			// 메서드에 대한 처리 
			((Banana) fruit1).saleBanana();
		} else if (fruit1 instanceof Peach) {
			System.out.println("복숭아 타입 타입 입니다 ");
		}
		
	}
}
