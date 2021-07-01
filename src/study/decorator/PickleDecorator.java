package study.decorator;

public class PickleDecorator extends ToppingDecorator {
	public PickleDecorator(Sandwich sandwich) {
		// TODO Auto-generated constructor stub
		super(sandwich);
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		super.make();
		addPickle();
	}

	private void addPickle() {
		System.out.println(" + 피클");
	}
}
