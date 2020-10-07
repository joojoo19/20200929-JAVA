package chap04.excercise;
import java.util.Scanner;

public class Excercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 >");
			
			String line = scanner.nextLine();
			int num = Integer.valueOf(line);
			int a = num;
			
			while(a==1) {
				System.out.println("예금액 >");
				line = scanner.nextLine();
				break;
			}
			while(a==2) {
				System.out.println("출금액 >");
				line = scanner.nextLine();
				break;
			}
			while(a==3) {
				System.out.println("잔고 >");
				line = scanner.nextLine();
				break;
			}
			while(a==4) {
				run = false;
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
