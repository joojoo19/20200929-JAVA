package chap07.leture.accessModifier.other;

import chap07.leture.accessModifier.MyClass;

public class SubClass extends MyClass {
	void method1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
	}
}
