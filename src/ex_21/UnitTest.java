package ex_21;

public class UnitTest {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");

		zealot1.attack(marine1);
		zealot1.attack(marine1);
		marine1.showInfo();

	}

}
