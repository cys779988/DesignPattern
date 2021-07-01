package study.adapter;

// Object Adapter 방식
public class SocketObjectAdapterImpl extends Socket implements SocketAdapter {

	private Socket sock = new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = sock.getVolt();
		return converVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = sock.getVolt();
		return converVolt(v, 40);
	}

	private Volt converVolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts()/i);
	}
}
