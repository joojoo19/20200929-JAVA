package myEx.chapex;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			
			String str = scanner.nextLine();

			
			switch(str) {
			case "1":
				System.out.println("예금액>");
				String str1 = scanner.nextLine();
				int a = Integer.valueOf(str1);
				balance = balance + a;
				break;
				
			case "2":
				System.out.println("출금액>");
				String str2 = scanner.nextLine();
				int b = Integer.valueOf(str2);
				balance = balance - b;
				break;
				
			case "3":
				System.out.println("잔고>" + balance);
				break;
				
			case "4":
				run = false;
				break;
				
			}
			
			
			System.out.println("프로그램 종료");
			
		}
		
		
	}
}
