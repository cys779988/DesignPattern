package study.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesignPattern dp = new DesignPattern.Builder("default")
							.setText("other value")
							.setNumber(0)
							.setDesc("Desc")
							.build();
		
		System.out.println(dp.toString());
		
		
		dp = new DesignPattern.Builder("default").setNumber(11).build();
		System.out.println(dp.toString());
	}
}
