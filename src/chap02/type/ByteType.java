package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		/*  byte : 정수형
		 *  크기 : 1byte (8bit)
		 *  
		 *   8bit로 표현 : 맨 앞에 1이면 음수, 0이면 0또는 양수
		 *  
		 *  -128 : 1000 0000 (최소값)
		 *     :
		 *  -3 : 1111 1101   
		 *  -2 : 1111 1110
		 *  -1 : 1111 1111
		 *   
		 *  +1
		 *  
		 *     1 0000 0000 : 8bit로 표현해야 하기 때문에 1을 버림		 
		 *     
		 *  0 : 0000 0000
		 *  1 : 0000 0001
		 *  2 : 0000 0010
		 *    :
		 *  127 : 0111 1111 (최대값)
		 *  
		 *  +1 
		 *  
		 *  -128 : 1000 0000  
		 *     
		 */
		
		byte byteValue;
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue =128; 최대값을 넘어서 오류 발생
		
		byteValue++;
		System.out.println(byteValue);
		
	}

}
