package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null; // 가리키고 있는 인스턴스가 없음.
	
		System.out.println(a.length); // 런타임익셉션
	}
}
