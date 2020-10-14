package myEx.chapex.chap06.ex20;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int size = 0;
	
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
	
		System.out.println("프로그램 종료");
		}
		
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano;
		int money;
		ano = scanner.next();
		System.out.print("출금액 : ");
		money = scanner.nextInt();
		Account cur = findAccount(ano);
		int minus = cur.getBalance() - money;
		cur.setBalance(minus);
		
	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("입금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano;
		int money;
		ano = scanner.next();
		System.out.print("입금액 : ");
		money = scanner.nextInt();
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);
		
		
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i <size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
			
		}
		return null;
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(int i = 0; i < size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno()+"\t"+cur.getOwner()+"\t"+cur.getBalance());
		}
		
	}

	private static void createAccount() {
		String ano;
		String owner;
		int money;
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("계좌주 : ");
		owner = scanner.next();
		System.out.print("초기입금액 : ");
		money = scanner.nextInt();
		
		accountArray[size] = new Account(ano, owner, money);
		size++;
		System.out.println("결과 : 계좌가 생성되었습니다");
		
		
		
	}
}
