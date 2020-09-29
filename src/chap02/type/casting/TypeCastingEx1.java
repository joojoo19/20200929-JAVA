package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
		
		// 1byte     2byte  4byte  8byte
		// boolean   char
		// byte      short   int    long
		//                  float  double
		
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환 : 작은값 -> 큰 값으로 변환가능
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		
		// 강제 형변환 : 큰 값에서 작은 값으로 변환할 때 ()안에 변경될 타입으로 작성.
		longValue = 3333;
		intValue = (int) longValue; // 뒤에 값을 앞에 ()안에 타입으로 변경. 캐스팅연산자: (타입)
		System.out.println(intValue);
		
		// 자동 형변환 (정수 → 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue; // 같은 4byte지만 정수부분은 23 bit여서 잃어버리는 값이 있을 수 있음.
		
		longValue = 922337206854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		
		doubleValue = longValue;
		
		
		// 강제 형변환 (실수 → 정수)
		intValue = (int) floatValue;
		
		
		
	}
}
