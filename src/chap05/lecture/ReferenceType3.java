package chap05.lecture;

public class ReferenceType3 {
	public static void main(String[] args) {
		int i =30;
		int j =30;
		
		String str1 = "java"; // string 리터럴은 기존에 값과 동일하면 
		String str2 = "java"; // 새로 인스턴스를 만들어 내지 않고 기존 것을 재사용됨.
		
		System.out.println(i == j);
		System.out.println(str1 == str2);
		
	}
}
