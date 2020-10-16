package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
	
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(7);
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
		RemoteControl.changeBattery(); // 객체없이 호출해서 사용가능.
	}
}
