package chap07.leture.excercise.ex06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
