package chap03.textbook;

public class CharOperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // 리터럴 + 리터럴 = char
		char c2 = 'A';
		//char c3 = c2 + 1; // 컴파일 에러 char + int = int
		char c3 = (char) (c2 + 1);
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		
	}
}
