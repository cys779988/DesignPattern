package study.factory_method;

// 조건에 따른 객체 생성을 팩토리 클래스로 위임하여, 팩토리 클래스에서 객체를 생성하는 패턴
// 분기에 따른 객체의 생성(new 연산자로 객체 생성)을 직접하지 않고, 팩토리라는 클래스에 위임하여 팩토리 클래스가 객체를 생성하는 방식
// 객체간의 결합도가 낮아지고 유지보수에 용이해짐
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA classA = new ClassA();
		classA.createType("A");
		classA.createType("C");
	}
}
