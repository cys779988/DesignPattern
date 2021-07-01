package study.observer;

// 어떤 객체에 이벤트가 발생했을 때, 이 객체와 관련된 객체들(옵저버들)에게 통지하도록 하는 디자인 패턴
// 즉, 객체의 상태가 변경되었을 때, 특정 객체에 의존하지 않으면서 상태의 변경을 관련된 객체들에게 통지하는 것이 가능
// Pub/Sub(발행/구독) 모델로 불림
// ex) Pub/Sub 모델에 따르면, 유튜브 채널은 발행자가 되고, 구독자들은 구독자(옵저버)가 되는 구조
// 유튜버가 영상을 올리면 구독자들을 영상이 올라왔다는 알림을 받음


public class Main {
	public static void main(String[] args) {
		User user = new User();
		ChatRoom chatRoom = new ChatRoom("채팅방");
		GameRoom gameRoom = new GameRoom("게임방");
		DevRoom devRoom = new DevRoom("개발방");
		user.attach(chatRoom);
		user.attach(gameRoom);
		user.attach(devRoom);
		
		String msg = "안녕하세요";
		user.notifyObservers(msg);
		
		user.detach(chatRoom);
		msg= "hi";
		
		user.notifyObservers(msg);
	}
}
