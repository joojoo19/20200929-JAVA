package chap08.textbook.s080303;


public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : "+ this.volume);
	}

}
