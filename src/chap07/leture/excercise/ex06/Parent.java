package chap07.leture.excercise.ex06;

public class Parent {
	public String nation;
	public Parent() {
		this("대한민국"); // 파라미터가 없는 생성자를 먼저 호출하고 this가 String 대한민국이 밑에 Parent(String nation) 호출해서 제일 먼저 실행됨.
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation; 
		System.out.println("Parent(String nation) call");
	}
}
