package ex_04;

public class IfElseTest2 {
	
	public static void main(String[] args) {

		int age = 17;

		if (age <= 7) {
			System.out.println("학교에 다니지 않습니다.");
		} else if (age <= 13) {
			System.out.println("초등학교에 다니고 있습니다.");
		} else if (age <= 16) {
			System.out.println("중학교에 다니고 있습니다.");
		} else {
			System.out.println("고등학교에 다니고 있습니다.");
		}

	}
}
