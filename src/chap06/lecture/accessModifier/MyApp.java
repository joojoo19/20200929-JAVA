package chap06.lecture.accessModifier;

public class MyApp {
public static void main(String[] args) {
	MyClass o1 = new MyClass();
//	System.out.println(o1.var3); 클래스 내에서만 사용 가능해서 에러
	System.out.println(o1.var2);
	System.out.println(o1.var1);
	
}
}
