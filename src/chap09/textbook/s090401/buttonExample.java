package chap09.textbook.s090401;

public class buttonExample {
public static void main(String[] args) {
	Button btn = new Button();
	
	btn.setOnCkickListener(new CallListener());
	btn.touch();
	
	btn.setOnCkickListener(new MessageListener());
	btn.touch();
}
}
