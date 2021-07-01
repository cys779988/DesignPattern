package study.factory_method;

public class ClassA {
	public Type createType(String type) {
		TypeFactory factory = new TypeFactory();
		Type returnType = factory.createType(type);
		// 패턴을 적용하기 전 ClassA가 할 일을 TypeFactory 클래스에서 하고 있음
		// ClassA는 TypeFactory 클래스를 사용하여 객체를 생성
		return returnType;
	}
}
