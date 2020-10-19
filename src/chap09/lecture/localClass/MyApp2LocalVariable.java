package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
		int i = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(i); // 여기서 쓰는 지역 변수는 final이여야 함.
//				i += 1;
			}
		}
	}
}
