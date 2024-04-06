package ex_23;

public class BeverageMakerTest {

	public static void main(String[] args) {
		BeverageMaker coffeeMaker = new CoffeeMaker();
		coffeeMaker.makeBeverage(); // 커피 제조 과정 실행

		System.out.println("------------------");

		BeverageMaker teaMaker = new TeaMaker();
		teaMaker.makeBeverage(); // 차 제조 과정 실행

	}

}
