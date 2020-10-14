package chap06.lecture.accessModifier.other;
import chap06.lecture.accessModifier.MyClass;
public class MyApp {
public static void main(String[] args) {
	MyClass o1 = new MyClass();
//	System.out.println(o1.var3);
//	System.out.println(o1.var2); // 같은 패키지 내에서만 사용가능해서 에러.
	System.out.println(o1.var1);
}
}
