package myEx.chapex;

public class MathRandom01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		while (a + b != 5) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			
			while (a + b == 5) {
				break;
			}
			System.out.println("(" + a + "," + b + ")");
		}
	}
}
