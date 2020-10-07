package chap04.excercise;

public class Excercise05 {
	public static void main(String[] args) {
     // 4x + 5y = 60  (5,8) (10,4)
		int x = 1;
		int y = 1;
		for(; x<=10; x++) {
			int a = 4*x;
			for(; y<=10; y++) {
				int b = 5*y;
				int sum = a+b;
				System.out.println(sum);
			}
			
		}
	}
}
