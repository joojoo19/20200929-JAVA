package chap07.leture.excercise.ex05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
}