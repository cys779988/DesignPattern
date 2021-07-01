package study.command;

// 객체의 행위(메서드)를 클래스로 만들어 캡슐화 하는 패턴
// 어떤 객체(A)에서 다른 객체(B)의 메서드를 실행하려면 그 객체(B)를 참조하고 있어야 하는 의존성이 발생
// 커맨드 패턴을 적용하면 의존성을 제거함
// 또한 기능이 수정되거나 변경이 일어날 때 A클래스 코드를 수정없이 기능에 대한 클래스를 정의하면 되므로 시스템이 확장성이 있으면서 유연해짐


public class Main {
	public static void main(String[] args) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heaterOnCommand = new HeaterOnCommand(heater);
		Command lampOnCommand = new LampOnCommand(lamp);
		OKGoogle okGoogle = new OKGoogle();
		
		okGoogle.setCommand(heaterOnCommand);
		okGoogle.talk();

		okGoogle.setCommand(lampOnCommand);
		okGoogle.talk();
	}
}
