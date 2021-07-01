package study.state;

public class Off implements PowerState{
	public void powerPush() {
		System.out.println("전원 off");
	}
}