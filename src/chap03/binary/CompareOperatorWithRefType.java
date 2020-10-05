package chap03.binary;

public class CompareOperatorWithRefType {
	public static void main(String[] args) {
		String s = "java"; // 리터럴 값이 같으면 같은 참조값을 갖음.
		String t = "java";
		
		String u = "ja";
		String v = "va";
		String w = u + v; // 연산을 통해 나온 값이라 문자는 같아도 참조값이 다름.
		
		System.out.println(s);
		System.out.println(t);	
		System.out.println(w);
		
		System.out.println(s == t);
		System.out.println(s == w); // 참조타입의 비교는 참조값을 비교함
	}
}
