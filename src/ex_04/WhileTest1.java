package ex_04;

public class WhileTest1 {

	public static void main(String[] args) {
		
		int i = 1; 
		while (i <= 10) {
			System.out.println("i 값 : " + i);
			// 조건식에 처리가 없다면 무한히 반복한다. 
			i++;
		}
		
		System.out.println("------------------");
		
		int num = 1;
		int sum = 0;

		while (num <= 10) {
			sum += num;
			num++;
		}

		System.out.println("합계 " + sum);
		System.out.println("num : " + num);
		
		System.out.println("------------------");
		
		while(true) {
			//무한 반복  
			System.out.print("."); // 지구 끝까지 가겠네 
	    }
	}
}
