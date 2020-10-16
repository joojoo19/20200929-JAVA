package chap07.leture.textbook.s070804;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다");
	}
	public abstract void sound();
	
}
