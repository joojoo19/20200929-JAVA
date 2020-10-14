package chap06.excercise.ex19;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	public int setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			 return this.balance = balance;
		} else {
			return this.balance;
		}
	}
	
	public int getBalance() {
		   return this.balance;
	}
}
