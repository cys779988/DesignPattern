package study.decorator;

public class ToppingDecorator extends Sandwich {
	private Sandwich sandwich;
	
	public ToppingDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	@Override
	public void make() {
		// TODO Auto-generated method stub
		sandwich.make();
	}
}
