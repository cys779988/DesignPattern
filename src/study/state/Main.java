package study.state;

// 객체가 특정 상태에 따라 행위를 달리하는 상황에서 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고,
// 상태를 객체화하여 상태가 행동을 할 수 있도록 위임하는 패턴
// 즉, 객체의 특정상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 행위들을 메서드로 정의
// 이러한 각 클래스들을 인터페이스로 캡슐화하여, 클라이언트에서 인터페이스를 호출하는 방식
// state 패턴을 strategy 패턴과 거의 동일한 구조
// strategy 패턴은 상속을 대체하려는 목적
// state 패턴은 코드내의 조건문들을 대체하려는 목적

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		On on = new On();
		Off off = new Off();
		Saving saving = new Saving();
		
		laptop.powerPush();
		laptop.setPowerState(on);
		laptop.powerPush();
		laptop.setPowerState(saving);
		laptop.powerPush();
		laptop.setPowerState(off);
		laptop.powerPush();
		laptop.setPowerState(on);
		laptop.powerPush();
	}

}
