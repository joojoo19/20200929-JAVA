package chap07.leture.casting;

public class MyApp {
public static void main(String[] args) {
	SubClass o1 = new SubClass();
	SuperClass[] arr = new SuperClass[3];
	arr[0] = new SubClass();
	method3(new SubClass());
	
	o1.method1();
	SubClass o2 = (SubClass) o1; //casting
	o1.method2();
	
}
public static void method3(SuperClass s) {
	s.method1();
}
}
