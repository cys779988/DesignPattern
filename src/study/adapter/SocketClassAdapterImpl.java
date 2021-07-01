package study.adapter;


// Class Adapter 방식
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return converVolt(v,10);
	}


	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return converVolt(v, 40);
	}

	private Volt converVolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts()/i);
	}
}
