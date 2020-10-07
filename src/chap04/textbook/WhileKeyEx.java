package chap04.textbook;

public class WhileKeyEx {
	public static void main(String[] args) throws Exception {
		System.out.println("입력>");
		int i = System.in.read(); // integer 반환.
		int j = System.in.read();
		int k = System.in.read();
		
		System.out.println("출력");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}

