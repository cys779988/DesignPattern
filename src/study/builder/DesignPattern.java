package study.builder;

// 빌더패턴은 복잡한 객체를 생성하는 방법을 정의하는 클래스와 표현하는 방법을 정의하는 클래스를 별도로 분리, 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공하는 패턴 

// 팩토리 패턴이나 추상팩토리 패턴에서 생성해야하는 클래스에 대한 속성 값이 많을 때 이슈
// 1. 클라이언트 프로그램으로부터 팩토리 클래스로 많은 파라미터를 넘겨줄 때 타입, 순서 등에 대한 관리가 어려워저 에러 발생 확률이 높아짐
// 2. 경우에 따라 필요없는 파라미터들에 대해서 팩토리 클래스에 일일이 null값을 넘겨줘야함
// 3. 생성해야 하는 sub class가 무거워지고 복잡해짐에 따라 팩토리 클래스 또한 복잡해짐

// 빌더 패턴 구현 방법
// 1. 빌더 클래스를 Static Nested Class로 생성합니다. 이때, 관례적으로 생성하고자 하는 클래스 이름 뒤에 Builder를 붙입니다. ex) Computer 클래스에 대한 빌더 클래스의 이름은 ComputerBuilder 라고 정의
// 2. 빌더 클래스의 생성자는 public으로 하며, 필수 값들에 대해 생성자의 파라미터로 받습니다.
// 3. 옵셔널한 값들에 대해서는 각각의 속성마다 메소드로 제공하며, 이때 중요한 것은 메소드의 리턴 값이 빌더 객체 자신이어야 합니다.
// 4. 마지막 단계로, 빌더 클래스 내에 build() 메소드를 정의하여 클라이언트 프로그램에게 최종 생성된 결과물을 제공합니다. 이렇듯 build()를 통해서만 객체 생성을 제공하기 때문에 생성 대상이 되는 클래스의 생성자는 private으로 정의해야 합니다.


public class DesignPattern {
	private String must;
	private String text;
	private String desc;
	private int number;
	
	private DesignPattern(String must, String text, String desc, int num) {
		this.must = must;
		this.text = text;
		this.desc = desc;
		this.number = num;
	}
	
	public static class Builder{
		private String mustbe;
		private String text = "default_value";
		private String desc = "default_value";
		private int number = 0;
		
		public Builder(String arg) {
			this.mustbe = arg;
		}
		
		public Builder setText(String text) {
			this.text = text;
			return this;
		}
		
		public Builder setDesc(String desc) {
			this.desc = desc;
			return this;
		}
		
		public Builder setNumber(int number) {
			this.number = number;
			return this;
		}
		
		public DesignPattern build() {
			return new DesignPattern(mustbe, text, desc, number);
		}
		
	}

	@Override
	public String toString() {
		return "DesignPattern2 [must=" + must + ", text=" + text + ", desc=" + desc + ", number=" + number + "]";
	}
	
	
}
