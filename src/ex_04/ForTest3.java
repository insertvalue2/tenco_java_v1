package ex_04;

public class ForTest3 {

	public static void main(String[] args) {
		// 행은 --> Row  
		// ----------
		// 열은 --> Column 
		//   |
		//   |
		//   |
		
		for (int i = 0; i < 3; i++) { // 행에 대한 반복
			for (int j = 0; j < 3; j++) { // 열에 대한 반복
				System.out.println("행 " + i + ", 열 " + j);
			}
		}

	}

}
