package chap08.lecture.anonyMousClass;

public class MyApp {

	public static void main(String[] args) {
		MyInterface o1 = new MyClass(); //인스턴스를 사용할 때 클래스를 꼭 만들어서  추상메소드를 구현해서 사용해야함.
		o1.method1();
		
		MyInterface o2 = new MyInterface() {
			
			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
		
		o2.method1();
	}

}
