package study.template_method;

public class Parent {
	public void someMethod() {
		System.out.println("부모에서 실행되는 부분 - 상");
		
		hook();
		
		System.out.println("부모에서 실행되는 부분 - 하");
	}

	public void hook() {
		// TODO Auto-generated method stub
		
	}
}
