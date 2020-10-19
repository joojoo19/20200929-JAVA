package chap09.textbook.s090401;

public class Button {
	OnClickListener listener;


	public void setOnCkickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	interface OnClickListener {
		void onClick();
	}
}
