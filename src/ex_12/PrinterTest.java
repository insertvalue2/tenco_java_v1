package ex_12;

public class PrinterTest {

	public static void main(String[] args) {

		// static 변수는 객체 생성 없이 
		// 클래스에 이름으로 접근 할 수 있다. 
		// why? heap에 들어가기 위해서는 new 키워드를 
		// 사용한 이후에 동작할 수 있지만 method area 영역은 
		// 프로그램이 실행되면 바로 할당 받는 영역이기 때문이다. 
		int number = NumberPrinter.waitNumber;
		System.out.println(number);

		NumberPrinter numberPrinter = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		NumberPrinter numberPrinter3 = new NumberPrinter(3);
		
		numberPrinter.printWaitNmber();
		numberPrinter.printWaitNmber();
		numberPrinter.printWaitNmber();
		numberPrinter.printWaitNmber();
		System.out.println("==============");
		numberPrinter2.printWaitNmber();
		numberPrinter2.printWaitNmber();
		System.out.println("==============");
		numberPrinter.printWaitNmber();
		numberPrinter3.printWaitNmber();

	}

}
