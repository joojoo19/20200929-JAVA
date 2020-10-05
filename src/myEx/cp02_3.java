package myEx;

public class cp02_3 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.4F;
		double doubleValue = 2.5;
		
		// 정수형의 연산 결과는 int
		byte result1 = byteValue + byteValue;
		// 위의 연산을 밑에 2가지로 바꿀 수 있음.
		int result = byteValue + byteValue;
		byte result5 = (byte)(byteValue + byteValue);

		
		int reslut2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;
		

	}
}
