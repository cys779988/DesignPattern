package study.decorator;


// 어떤 기능에 추가적으로 기능을 덧붙이고 싶은 경우, 그 기능들을 Decorator로 만들어서 덧붙이는 방식

public class Main {
	public static void main(String[] args) {
		Sandwich sandwichWithLettuce = new LettuceDecorator(new Bread());
		sandwichWithLettuce.make();
		System.out.println("---------");
		
		Sandwich sandwichWithPickle = new PickleDecorator(new LettuceDecorator(new Bread()));
		sandwichWithPickle.make();
	}
}
