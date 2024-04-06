package ex_17;

public class Hero {
	
	// protected : 자식 클래스에서 접근 가능한 레벨링이다.
	
	//1. 같은 패키지 내의 모든 클래스에서 접근 가능합니다.
	//2. 다른 패키지에 속한 자식 클래스에서도 접근 가능합니다.
	//3. 다른 패키지에 속한 클래스에서는 접근할 수 없습니다.
	
	protected String name;
	protected int hp;

	public Hero(String name, int hp) {
		System.out.println("Hero 클래스 생성 합니다.");
		this.name = name;
		this.hp = hp;
	}

	void attack() {
		System.out.println("기본 공격 합니다");
	}

}
