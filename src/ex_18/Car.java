package ex_18;

public class Car {

	String name;
	int price;

	private Engine engine; // Car 클래스는 Engine 객체를 포함합니다.

	public Car() {
		engine = new Engine(); // Car 객체가 생성될 때 Engine 객체도 생성됩니다.
	}

	void startCar() {
		engine.start(); // Car 객체를 통해 Engine의 start 메서드를 호출합니다.
		System.out.println("자동차가 출발합니다.");
	}

	void stopCar() {
		engine.stop(); // Car 객체를 통해 Engine의 stop 메서드를 호출합니다.
		System.out.println("자동차가 멈춥니다.");
	}

	// 테스트 코드 작성
	public static void main(String[] args) {
		Car car = new Car(); // Car 객체를 생성합니다.
		car.startCar(); // 자동차를 출발시킵니다.
		car.stopCar(); // 자동차를 멈춥니다.
	}
}
