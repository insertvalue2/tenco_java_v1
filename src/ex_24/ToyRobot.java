package ex_24;

public class ToyRobot implements RemoteController, SoundEffect  {

	String name;

	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("두두두두두~~~");
	} 
	
}
