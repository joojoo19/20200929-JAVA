package chap06.excercise.ex20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size =0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo ==3) {
				deposit();
			} else if(selectNo ==4) {
				withdraw();
			} else if(selectNo ==5) {
				run =false;
			}
		}
		System.out.println("프로그램 종료");
		
		// 계좌 생성
		private static void createAccount() {
			String ano;
			String owner;
			int money;
			System.out.println("---------");
			System.out.println("계좌 생성");
			System.out.println("---------");
			System.out.println("계좌번호:");
			ano = scanner.next();
		    System.out.println("계좌주:");
		    owner = scanner.next();
		    System.out.println("초기입금액:");
		    money = scanner.nextInt();
		    
			Account account = new Account(ano, owner,money);
			accountArray[size] = account;
			size++;
		}
		// 계좌 목록
		private static void accountList() {
			System.out.println("---------");
			System.out.println("계좌 목록");
			System.out.println("---------");
			
			
		}
		//예금
		private static viod deposit() {
			System.out.println("---------");
			System.out.println("예금");
			System.out.println("---------");
			
		}
		//출금
        private static viod withdraw() {
			System.out.println("---------");
			System.out.println("출금");
			System.out.println("---------");
			Account obj = new Account();
			setBalance()
			
		}
		private static Account findAccount(String ano) {

			
		}
	}
}
