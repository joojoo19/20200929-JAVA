package chap03.binary;

public class CompareOperator {
	public static void main(String[] args) {
		// 비교 연산자
		// ==, !=, <, <=, >, >=
		// 결과 boolean
		
		int a = 3;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		double c = 3.0;
		System.out.println(a == c);
		
		float d = 0.1F;
		double e = 0.1;
		System.out.println(d == e); 
		// 실수는 타입이 다를 경우 원하는 결과가 나오지 않을 수도 있음
		
	}
}
