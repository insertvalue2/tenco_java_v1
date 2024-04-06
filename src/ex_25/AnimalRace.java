package ex_25;

public class AnimalRace {
	public static void main(String[] args) {
		RaceParticipant turtle = new Turtle();
		RaceParticipant rabbit = new Rabbit();

		System.out.println(turtle.getName() + "의 속도: " + turtle.getSpeed());
		System.out.println(rabbit.getName() + "의 속도: " + rabbit.getSpeed());

		// 경주 결과 발표
		if (turtle.getSpeed() > rabbit.getSpeed()) {
			System.out.println(turtle.getName() + "가 승리했습니다!");
		} else if (turtle.getSpeed() < rabbit.getSpeed()) {
			System.out.println(rabbit.getName() + "가 승리했습니다!");
		} else {
			System.out.println("경주는 무승부입니다!");
		}
	}
}