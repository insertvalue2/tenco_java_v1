package ex_14;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alpahbets = new char[26];
		char ch1 = 'A';
		alpahbets[0] = ch1;
		
		char ch2 = 'B';
		alpahbets[1] = ch2;
		
		char ch3 = 'C';
		alpahbets[2] = ch3;
		
		
		char ch26 = 'Z';
		alpahbets[25] = ch26;
		
//		System.out.print(alpahbets[0]);
//		System.out.print(alpahbets[1]);
//		System.out.print(alpahbets[2]);
		
		// 배열은 반복문과 함께 많이 사용 된다.
		// i = 0, i = 1, i = 2
		int forCount = 0; 
		for (int i = 0; i < alpahbets.length; i++) {
			System.out.print(alpahbets[i]);
			forCount++;
		}
		System.out.println();
		System.out.println("for 동작 횟수 : " +  forCount);
	}

}
