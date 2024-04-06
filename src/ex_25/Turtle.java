package ex_25;

public class Turtle implements RaceParticipant {
    
	private final int speed = 2; // 거북이의 속도: 2
    
    @Override
    public String getName() {
        return "Turtle";
    }
    
    @Override
    public int getSpeed() {
        return this.speed;
    }
}
