package chap02.type;

public class Longtype {
	public static void main(String[] args) {
		// long : 8byte (64bit)(계산기 qword)
		// 최대값 : 9223372036854775807
		// 최소값 : -9223372036854775808
		// 정수 리터럴을 값은 int 최대값을 넘을 수 없음.
		
		long longValue;
		longValue = 9223372036854775807L; // long 타입의 리터럴값을 나타내기 위해 뒤에 L을 넣음.
		System.out.println(longValue);
		
		longValue = 9_223_372_036_854_775_807L;
		
		longValue = -9223372036854775808L;
		System.out.println(longValue);
	}

}
