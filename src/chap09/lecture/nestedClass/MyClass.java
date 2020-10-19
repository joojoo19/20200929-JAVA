package chap09.lecture.nestedClass;

public class MyClass {
	class Class1{ // 인스턴스 클래스
		int i;
//		static int j;  // 에러남
		Class1(int i) {
			
		}
		
		void method() {
			
		}
	}
	
	static class Class2 { //클래스 멤버
		int i;
		static int j;
		class2(int i ) {
			
		}
		void method( ) {
			
		}
	}
}
