package study.singleton;

// 인스턴스가 프로그램 내에서 오직 하나만 생성되는 것을 보장하고, 프로그램 어디에서든 이 인스턴스에 접근할 수 있도록 하는 패턴
// 즉, 인스턴스가 사용될 때 똑같은 인스턴스를 여러 개 만드는 것이 아니라, 기존에 생성했던 동일한 인스턴스를 사용하게끔 하는 것

public class Main {
	
	static class Singleton{
		private Singleton() {}
		private static final Singleton instance = new Singleton();
		public static Singleton getInstance() {
			return instance;
		}
		public void print() {
			System.out.println("print");
		}
	}
	public static void main(String[] args) {
		Singleton.getInstance().print();
	}
}

class Singleton2{
	private Singleton2() {}
	private static Singleton2 instance;
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	public void print() {
		System.out.println("print");
	}
}

class Singleton3{
	private Singleton3() {}
	private static Singleton3 instance;
	public static Singleton3 getInstance() {
		if(instance == null) {
			synchronized (Singleton3.class) {
				if(instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
	public void print() {
		System.out.println("print");
	}
}

