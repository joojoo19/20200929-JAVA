package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리연산자
		// && & and : 양변이 true 일 때만 true
		// || | or : 양변이 false 일 때만 false
		// ^ xor(exclusive or, 배타적논리합) : 값이 다를때만 true
		System.out.println("----------and---------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("----------or---------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("----------xor---------");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("---------- & | ---------");
		int a = 3;
		System.out.println(false & false); // 앞에 피연산자가 false여도 뒤에 피연산자를 확인함.
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ <0)); 
		System.out.println(a);
		
		System.out.println("---------- && || ---------");
		System.out.println(false && false); // 앞에가 피연산자가 false 이면 뒤에 피연산자를 확인하지 않음.
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ <0));
		System.out.println(a);
		
		
		
		
	}
}
