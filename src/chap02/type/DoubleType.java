package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		// double : 8byte(64bit)
		// 실수 리터럴의 기본은 더블. 
		// float 보다 촘촘하게 실수타입을 표현할수 있음.

		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6; //3.0 * 10의 6제곱
		System.out.println(doubleValue);
		
		
		// 실수형 계산시 주의 
		// 저장하는 공간에 한계로 근사치를 갖게 됨. 윈하지 않는 값이 나올수도 있음.
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3);
	}
}
