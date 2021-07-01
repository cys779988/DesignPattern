package study.strategy;

// 객체들이 할 수 있는 행위 각각에 대해 전략 클래스를 생성하고, 유사한 행위들을 캡슐화하는 인터페이스를 정의,
// 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고 전략을 바꿔주기만 함으로써 행위를 유연하게 확장하는 방법
// 즉, 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고
// 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하도록 하는 패턴


public class Main {
	public static void main(String[] args) {
		Moving train = new Train();
		Moving bus = new Bus();
		
		train.setMovableStrategy(new RailLoadStrategy());
		bus.setMovableStrategy(new LoadStrategy());
		
		train.move();
		bus.move();
		
		bus.setMovableStrategy(new RailLoadStrategy());
		bus.move();
	}
}
