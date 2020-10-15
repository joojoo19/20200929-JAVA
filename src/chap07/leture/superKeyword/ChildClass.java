package chap07.leture.superKeyword;

public class ChildClass extends ParentClass {
	@Override
	void method1() {
	super.method1(); // super 상위 클래스로 접근하는 키워드
	
	System.out.println("child method1");
	}
}
