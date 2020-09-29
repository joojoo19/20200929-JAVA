package chap02.type;

public class IntType {
	public static void main(String[] args) {
		// int : 4byte (32bit) (계산기에서 dword)
		// 정수 리터럴의 기본값
		// 최대값 : 2147483647
		// 최소값 : -2147483648
		
		int intValue = 2147483647;
		System.out.println(intValue);
		
		intValue++;
		System.out.println(intValue);
		
		intValue = -2147483648;
		System.out.println(intValue);
		
		// 정수리터럴 : 10진법이 아닌 다른방법으로 입력가능.
		//intValue = 2147483648; 최대값을 벗어나 에러
		 intValue = 2_147_483_647; // 백단위로 ,를 찍는 것 처럼 _으로 나눌수 있음
		 intValue = 017777777777; // 앞에 0을 붙이면 8진법
		 System.out.println(intValue);
		 
		 intValue = 0x7FFFFFFF; // 앞에 0X를 붙이면 16진법
		 
	}

}
