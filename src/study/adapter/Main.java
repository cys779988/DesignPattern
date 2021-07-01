package study.adapter;

// 어댑터 패턴을 구현하기 위해 ClassAdapter 와 Object Adapter 두가지 방법
// Class Adapter : 자바의 상속을 이용한 방법
// Object Adapter : 자바의 합성을 이용한 방법

public class Main {
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}
}
