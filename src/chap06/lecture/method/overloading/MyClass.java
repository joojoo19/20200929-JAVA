package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1......");
	}
	void method1(int i) { // 같은 메소드 이름에는 파라미터의 타입이나 개수를 달리하거나 순서가 다르게 하면 됨.
		System.out.println("method1#########");
	}
	void method1(double j) {
		System.out.println("method1*******");
	}
	void method1(int i, double j) {
		System.out.println("method1 int, double");
	}
	
	void method1(double i, int j) {
		System.out.println("method1 double, int");
	}
	
//	int method1(double i, int j) {
//		return;
//	}   다른 return타입에 같은 파라미터는 사용 할 수 없음.
	
}
