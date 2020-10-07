package chap04.excercise;

public class Excercise05 {
	public static void main(String[] args) {
     // 4x + 5y = 60  (5,8) (10,4)
		int x = 1;
		int y = 1;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if ((4*x) + (5*y) == 60) {
				System.out.println("(" + x + "," + y + ")");
			}
			}
		}
	}
}
