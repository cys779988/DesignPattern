package study.observer;

import java.util.ArrayList;
import java.util.List;

// 옵저버를 추가하고 제거하고 메시지를 알리는 기능
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String msg) {
		for (Observer observer : observers) {
			observer.receive(msg);
		}
	}
}
