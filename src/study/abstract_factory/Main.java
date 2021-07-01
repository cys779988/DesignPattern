package study.abstract_factory;

// 서로 관련 있는 객체들을 통째로 묶어서 팩토리 클래스로 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		factoryOfComputerFactory.createComputer("LG");
	}

}
