package myEx;

public class cp02_2 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A"; // 참조타입 String
		                       // 참조타입과 기본타입은 서로 형변환이 안됨.
		
		double var1 = (double)intValue;
		byte var2 = (byte)intValue;
		int var3 = (int)doubleValue;
		char var4 = (char)strValue;
		
		System.out.println();
				
	}
}
