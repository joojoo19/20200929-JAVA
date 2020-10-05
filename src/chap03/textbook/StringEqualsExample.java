package chap03.textbook;

public class StringEqualsExample {	
	public static void main(String[] args) {
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2); // 참조값 비교
		System.out.println(strVar1 == strVar3);
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); // equals()는 문자열을 비교
	}
}
