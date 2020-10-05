package chap03.textbook;

public class SignOperatorExample {
	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 =" + result1);
		System.out.println("reault2 =" + result2);
		
		short s =100;
		// short result3 = -s // 컴파일 에러 연산의 결과이기 때문에 int타입으로 결과가 나옴.
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}
}
