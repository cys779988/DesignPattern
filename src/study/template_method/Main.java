package study.template_method;


// 여러 클래스에서 공통으로 사용하는 메서드를 상위 클래스에서 정의하고, 하위 클래스마다 다르게 구현해야 하는 세부적인 사항을 하위클래스에 구현
// 코드의 중복제거를 위해 흔히 사용하는 리팩토링 기법
// 상위 클래스에서 정의하는 부분은 "템플릿 메서드"라 하고,
// 템플릿 메서드에서 하위 클래스마다 다르게 작성되야 하는 일부분을 "훅"이라 함

public class Main {
	public static void main(String[] args) {
		ChildA childA = new ChildA();
		childA.someMethod();
		
		System.out.println("-----------");
		
		ChildB childB = new ChildB();
		childB.someMethod();
	}
}
