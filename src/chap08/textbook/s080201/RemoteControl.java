package chap08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // public stastic final이 생략가능
	public int MIN_VOLUME = 0;
	
	// 추상메소드
	public void turnOn(); // public stastic이 생략가능
	public void turnOff();
	public void setVolume(int volume);
	
	// 디폴트메소드
	default void setMute(boolean mute) { // 재정의가능
		if(mute) {System.out.println("무음처리"); }
		else {System.out.println("무음해제"); } 
			
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
	
}
