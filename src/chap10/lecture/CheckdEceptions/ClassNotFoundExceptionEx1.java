package chap10.lecture.CheckdEceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("실행1");
		try {
			System.out.println("실행 try1");
			
			Class.forName("java.lang.String2");
			
			System.out.println("실행 try2"); //익셉션이 발생하면 실행하지 않음
		} catch (ClassNotFoundException e) {
			System.out.println("익셉션 발생!!!!");
		} finally {
			System.out.println("무조건실행"); // 익셉션 발생여부와 상관없이 실행
		}

		System.out.println("실행2");
	}
}
