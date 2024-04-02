package ex_12;

public class NumberPrinter {
	
	private int id;
	// 인스턴스들이 공유 할수 있는 메모리 영역이다.
	public static int waitNumber = 1;

	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}

	// 번호표를 출력합니다.
	public void printWaitNmber() {
		waitNumber++;
		System.out.println(id + " 기기에 대기 순번은 : " + waitNumber);
	}
}
