package ex_03;
import java.util.Scanner;

public class Operation8 {
    public static void main(String[] args) {
        System.out.println("입력 받은 두 수 중 큰 수를 출력하세요\n");
        
        // 자바 표준 라이브러리
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력1: "); // print, println 확인 
        int x = scanner.nextInt();
        System.out.print("입력2: "); 
        int y = scanner.nextInt();
        
        int max = (x > y)? x : y;
        System.out.println("큰 수는: " + max); // 결과 출력 시 설명 추가
        
        // 자원 닫기
        scanner.close();
    }
}
