package ex_04;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("변의 길이를 입력하세요: ");
		int length = scanner.nextInt();

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
