package study.command;

public class LampOnCommand implements Command {
	private Lamp lamp;
	
	public LampOnCommand(Lamp lamp) {
		// TODO Auto-generated constructor stub
		this.lamp = lamp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lamp.turnOn();
	}
}
