package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z);
		
		//오버플로우 오류 해결
		
		long a = 1000000;
		long b = 1000000;
		long c = x * y;
		
		System.out.println(c);
	}
}
