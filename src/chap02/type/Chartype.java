package chap02.type;

public class Chartype {
	public static void main(String[] args) {
		// char : 2byte 
		// 작은따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
		// charValue = 'ab';
		// charValue = ''; 빈문자를 가질수 없음
		charValue = ' '; // 띄어쓰기는 space라는 문자
		
		charValue  = 44032; // 2byte 내의 문자를 가질수 있음
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00';  // 역슬래시u와 16진법을 쓸 수 있음.
		System.out.println(charValue);
	}

}
