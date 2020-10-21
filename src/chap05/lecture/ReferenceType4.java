package chap05;

public class ReferenceType4 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java"); // 새로운 객체(인스턴스) 생성.
		System.out.println(str1 ==str2);
		System.out.println(str2 == str3); // 참조값 비교
		
		System.out.println(str2.equals(str3)); // 문자열 비교
	}
}
