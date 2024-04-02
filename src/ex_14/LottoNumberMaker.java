package ex_14;

import java.util.Random;

public class LottoNumberMaker {
	
	public static void main(String[] args) {
		
		// R - 조회 
		int[] gameResult = makeNumbers(); 
		for (int i = 0; i < gameResult.length; i++) {
			System.out.print(gameResult[i] + ", ");
		}
	}
	
	public static int[] makeNumbers() {
		
		Random random = new Random();
		
//		int g1 = random.nextInt(45) + 1; 
//		int g2 = random.nextInt(45) + 1;
//		int g3 = random.nextInt(45) + 1;
//		int g4 = random.nextInt(45) + 1;
//		int g5 = random.nextInt(45) + 1;
//		int g6 = random.nextInt(45) + 1;
		
		int[] numbers = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(45) + 1;
		}
				
		return numbers; 
	}
}
