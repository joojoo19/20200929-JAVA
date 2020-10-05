package myEx;

public class cp02_1 {
	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		int intValue2 = charValue;
		short shortValue = charValue; // 같은 2byte 지만 저장 방법이 다름.
		double doubleValue = byteValue;
	}

}
