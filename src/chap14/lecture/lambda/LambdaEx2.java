package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		o1.method();
		
		MyInterface o2 = ()-> {System.out.println("java");};
		MyInterface o3 = ()-> System.out.println("java"); // 한 줄은 중괄호 생략 가능.
		
		o2.method();
		o3.method();
		
	}
}
