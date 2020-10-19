package chap09.textbook.s090401;

public class buttonExample {
public static void main(String[] args) {
	Button btn = new Button();
	
	btn.setListener(new CallListener());
	btn.touch();
	
	btn.setListener(new MessageListener());
	btn.touch();
}
}
