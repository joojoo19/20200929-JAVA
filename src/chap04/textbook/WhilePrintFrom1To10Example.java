package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("------------------");
		//11~20
		i = 11;
		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		System.out.println("------------------");
		// 1~9 홀수
		int j = 1;
		while (j<=9) {
			System.out.println(i);
			j += 2;
		}
		System.out.println("------------------");
		//10~1
		int a = 10;
		while (a >=1) {
			System.out.println(a);
			a--;
		}
		System.out.println("------------------");
		//10~2짝수
		int b = 10;
		while (b>=2) {
			System.out.println(b);
			b -= 2;
		}
			
	}
}
