package study.command;

public class HeaterOnCommand implements Command {
	private Heater heater;
	
	public HeaterOnCommand(Heater heater) {
		// TODO Auto-generated constructor stub
		this.heater = heater;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		heater.powerOn();
	}
}
