package chap09.Excercise.Ex06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName +"] " +inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
