package chap06.lecture.thisKeyword;

public class MyClass {
	int var; // this는 인스턴스필드를 의미. 앞으로 만들어 지는 참조변수를 대신.
	
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {  // 인스턴스 메소드
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}
	
	void method2() {
		this.method1(); // 인스턴스필드와 인스턴스 메소드를 가리킬 수 있음.
	}
	
}
