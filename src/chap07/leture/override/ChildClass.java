package chap07.leture.override;

public class ChildClass extends ParentClass {
void method2() {
	System.out.println("child method");
}

@Override // 주석과 비슷. @Override 컴파일러에 힌트를 줌.
void method1() { // 부모클래스 메소드 수정 : 리턴타입 메소드명 파라미터를 똑같이 입력해야함.
	System.out.println("child method!!!!");
}
}
