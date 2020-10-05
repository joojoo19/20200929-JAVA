package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
		// int intVlaue2 = intValue + longValue;
		// 작은 타입의 값이 큰 타입으로 변환되서
		// 큰 타입으로 결정.
		
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
		// int intValue3 = intValue + doubleValue;
		// 실수와 정수의 연산 결과는 실수.
		
		double doubleValue3 = intValue + doubleValue;
		
	    // 정수형의 연산 결과는 int
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		// short shortValue3 = shortValue1 + shortValue2;
		// short + short = int 
		int ontValue4 = shortValue1 + shortValue2;
	}

}
