package myEx.chapex;

public class ForLoop01 {
	public static void main(String[] args) {
		// 4x + 5y = 60
		
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if((4*x)+(5*y)==60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		// 3x + 5y = 60
		for(int a=0; a<=10; a++) {
			for(int b=0; b<=10; b++) {
				if((3*a)+(5*b)==60) {
					System.out.println("(" + a + "," + b + ")");
				}
			}
		}
	}
}
