package useful.ex03;

public class ArrayExceptionHandling {
	public static void main(String[] args) {

		// 배열 선언과 동시에 초기화 하기
		// int[] arr = new int[10];
		int[] arr = { 1, 2, 3, 4, 5 }; // length - 5, index - 4

		try {

			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에 크기를 벗어 났습니다.");
		}

		System.out.println("비정상 종료 되지 않았어요!");

	} // end of main
}
