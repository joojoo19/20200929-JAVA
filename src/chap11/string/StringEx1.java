package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		
		// charAt : index 문자 추출
		
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		// equals
		
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6);
		System.out.println(str2.equals(str6));
		
		// indexOf 같은 단어가 있으면 가장 앞에 있는 것 선택 반환. 지정한 문자가 없으면 -1로 반환
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("프로");
		System.out.println(a);
		
		// length 
		String str8 = "이것이 자바다     java";
		int b = str8.length();
		System.out.println(str8.length());
		System.out.println(str8.charAt(b-1));
		
		
		// replace
		String str9 = "asdasdqweqweqwe";
		String str10 = str9.replace("asd", "1234");
		System.out.println(str9);
		System.out.println(str10);
		
		//substring
		String str11 = "1230123456789";
		String sub = str11.substring(2, 3); // 시작인덱스부터 끝인덱스 사이의 값 반환. 끝 인텍스는 포함하지 않음.
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6); //지정된 인덱스부터 끝까지 반환.
		System.out.println(sub);
		
		
		// trim  중간공백은 제거 못함.
		String str12 = "  java";
		String t = str12.trim();
		System.out.println(t);
		
	}
}
