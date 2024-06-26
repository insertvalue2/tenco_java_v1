package ex_21;

public class Unit {
	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + " 사망하였습니다.");
			return; // return 값을 반환 할 때 사용할 수 있고 실행에 종료를 시킬 수도 있다.
		}
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;
	}

	public void showInfo() {
		System.out.println("====상태창====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
}
