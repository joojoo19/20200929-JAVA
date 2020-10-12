package chap06.textbook.s060703;

public class Korean {
	//필드
	String nation =  "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String n, String s) { // 파라미터를 받은 생성자가 있으면 파라미터가 없는 생성자를 사용할 수 없음.
		
		name = n;
		ssn = s;
	}
}
