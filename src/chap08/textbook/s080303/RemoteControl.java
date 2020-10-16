package chap08.textbook.s080303;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // public stastic final이 생략가능
	public int MIN_VOLUME = 0;
	
	// 추상메소드
	public void turnOn(); // public stastic이 생략가능
	public void turnOff();
	public void setVolume(int volume);
}
