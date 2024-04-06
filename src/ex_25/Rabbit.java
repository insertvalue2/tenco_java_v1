package ex_25;

class Rabbit implements RaceParticipant {
    
	private final int speed = 10; // 토끼의 속도: 10
    
    @Override
    public String getName() {
        return "Rabbit";
    }
    
    @Override
    public int getSpeed() {
        return this.speed;
    }
}
