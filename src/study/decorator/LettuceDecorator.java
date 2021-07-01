package study.decorator;

public class LettuceDecorator extends ToppingDecorator {
	public LettuceDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		super.make();
		addLettuce();
	}

	private void addLettuce() {
		System.out.println(" + 양상추");
	}
}
