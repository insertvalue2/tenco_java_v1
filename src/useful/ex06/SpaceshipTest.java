package useful.ex06;

import useful.ex06.Spaceship.Engine;

public class SpaceshipTest {

	public static void main(String[] args) {
		
		// 우주선 일부 완성 (엔진은 미 장착 상태 임) 
		Spaceship spaceship = new Spaceship();
		
		// 멤버 내부 클래스와 차이점 
		// static inner class 는 외부(다른곳에서 쉽게 접근할 수 있다) 
		
		Engine 누리호1번엔진 = new Spaceship.Engine();
		Engine 누리호2번엔진 = new Spaceship.Engine();
		Engine 누리호3번엔진 = new Spaceship.Engine();
		// 변수명은 한글로 작성하지 말자 !! 
		
		
		// 현재 까지 생성된 엔지 count 확인 해보기 !!
		// engineCount static 변수 이다.  
		// tip. 외부 클래스 이름으로 부터 접근 가능		
		System.out.println("static 변수 : " +  Spaceship.Engine.engineCount);
		
		// 엔진 테스트 시 1,2 실패 3번 테스트 성공 
		// 우주선에 엔진을 장작해 보자. 
		System.out.println("--------------------------");
		spaceship.startSpaceShip();
		spaceship.addEngine(누리호3번엔진);
		spaceship.startSpaceShip();
		
		
		// 사용하는 이유 
		// [[ 논리적 그룹화 ]] 
		// 정적 내부 클래스는 외부 클래스와 논리적으로 관련 있는
		// 클래스들을 그룹화하는 데 유용합니다. 이는 코드의 가독성과 구조화를 개선하며,
		// 관련 클래스들을 함께 유지할 수 있게 합니다.
		
		// ... 다양한 장점들이 존재 할 수 있다. 
		
	}

}
