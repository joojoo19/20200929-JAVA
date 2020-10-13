package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
	}
	int method2() {
		System.out.println("메소드2 실행");
		
		// 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌.
		// 메소드 앞에 리턴되는 타입을 명시해야함.
		// return이 필요없으면 void
		// return 다음은 작성하면 안됨.
		// 리턴타입을 명시하고 return을 꼭 해야하고, return 오른쪽타입이 명시된 타입과 일치해야함
		return var1*2;
	}
}
