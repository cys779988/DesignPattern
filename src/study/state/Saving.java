package study.state;

public class Saving implements PowerState{
	public void powerPush() {
		System.out.println("절전 모드");
	}
}