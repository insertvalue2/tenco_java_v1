package ex_04;

import java.util.Scanner;

public class EvenSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int maxNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= maxNumber; i += 2) { // 2부터 시작하여 2씩 증가
            sum += i;
        }

        System.out.println("짝수의 합: " + sum);
        scanner.close();
    }
}
