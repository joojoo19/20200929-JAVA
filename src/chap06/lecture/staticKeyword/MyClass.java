package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2; // 클래스 필드, static 필드
	int var1; // 인스턴스 필드
	
	static { // 클래스에서 처음 실행되는 코드가 들어감.
		System.out.println("static block");
		var2 = 3000;
		
	}
	
	void method1() { // 인스턴스 메소드
		System.out.println(var1);
	}
	
	static void method2() {
		System.out.println(var2);
	}
}
