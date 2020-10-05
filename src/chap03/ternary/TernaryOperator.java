package chap03.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		//   a ?   b : c
		// 위 연산의 결과는 b 또는 c 
		// 1항이 true->2항, 1항이 false -> 3항이 값으로 산출.
		
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c);
	}
}
