package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyClass o2 = new MyClass();
		
		o1.var1 = 99;
		o2.var1 = 77;
		
		o1.method1();
		o2.method1();
		
		o1.var2 = 100;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		
		o2.var2 = 200;
		System.out.println(o1.var2);
		
		MyClass.var2 = 300; // 클래스 이름으로도 접근 가능.
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		System.out.println(MyClass.var2);
		
		System.out.println("---------------");
		
		o1.method2();
		o2.method2();
		MyClass.method2();
		
		
		 // static멤버에서 인스턴스 멤버에 접근 할 수 없음
		 // 인스턴스 멤버에서 static 멤버에 접근 할 수 있음.
	}
}
