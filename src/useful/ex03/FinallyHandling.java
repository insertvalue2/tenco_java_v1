package useful.ex03;

import java.util.Scanner;

public class FinallyHandling {
	public static void main(String[] args) {

		// try-catch-finally
		// finally ? 언제 사용할까?
		Scanner scanner = new Scanner(System.in);

		try {
			int reuslt = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // 자원 해제 용도로도 많이 사용 된다.
			System.out.println("자원 해제 했어요");
		}
	} // end of main
}
